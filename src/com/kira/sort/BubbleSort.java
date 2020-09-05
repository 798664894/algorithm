package com.kira.sort;

import com.kira.common.utils.SortUtils;

/**
 * 冒泡排序
 * 相邻元素比较交换
 */
public class BubbleSort {

    public static Comparable[] sort(Comparable[] arr) {

        if (arr.length < 2) {
            return arr;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (SortUtils.less(arr[j+1],arr[j])) {
                    SortUtils.exch(arr,j,j+1);
                }
            }
        }
        return arr;
    }
}
