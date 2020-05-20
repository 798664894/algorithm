package com.kira.sort;

import com.kira.common.utils.SortUtils;

/**
 * 自顶向下的归并
 */
public class MergeSortTD {

    public static Comparable[] aux;

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
        aux = new Comparable[a.length];
        return sort(a,0,a.length-1);
    }

    public static Comparable[] sort(Comparable[] a, int lo, int hi) {
        if (lo >= hi){
            return a;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a,lo,mid);
        sort(a,mid+1,hi);
        if (SortUtils.less(a[mid],a[mid+1])) {
            return a;
        }
        merge(a,lo,mid,hi);
        return a;
    }
}
