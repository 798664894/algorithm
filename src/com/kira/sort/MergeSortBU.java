package com.kira.sort;

import com.kira.common.utils.SortUtils;


/**
 * 自底向上的归并
 */
public class MergeSortBU {

    private static Comparable[] aux;

    public static void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo;
        int j = mid+1;

        //拷贝到辅助数组
        if (hi + 1 - lo >= 0) {
            System.arraycopy(a, lo, aux, lo, hi + 1 - lo);
        }

        for (int k = lo; k <= hi; k++) {
            if (i>mid) {
                a[k] = aux[j++];
            }else if (j>hi) {
                a[k] = aux[i++];
            }else if (SortUtils.less(aux[j],aux[i])) {
                a[k] = aux[j++];
            }else {
                a[k] = aux[i++];
            }
        }
    }

    public static Comparable[] sort(Comparable[] a) {
        if (a.length < 2) {
            return a;
        }
         int n = a.length;
         aux = new Comparable[n];
         for (int size = 1; size < n; size += size) {
             for (int i = 0; i< n-size; i += 2*size) {
                 merge(a,i, i+size-1,Math.min(i+2*size-1,n-1));
             }
         }
         return a;
    }
}
