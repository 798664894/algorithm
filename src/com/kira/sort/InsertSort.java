package com.kira.sort;

import com.kira.common.utils.SortUtils;

public class InsertSort {

    /**
     *插入排序
     * 将元素与前面已经排号序的数组比较并且插入
     * 时间复杂度O(n^2)
     */
    public static Comparable[] sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0 && SortUtils.less(a[j],a[j-1]); j--) {
                SortUtils.exch(a,j,j-1);
            }
        }
        return a;
    }

}
