package com.kira.sort;

import com.kira.common.utils.SortUtils;

/**
 * 选择排序
 * 找到数组最小元素，与第一个交换
 * 找到剩下数组最小元素，与剩下第一个交换
 */
public class ChooseSort {

    public static Comparable[] sort(Comparable[] arr) {
        if (arr.length < 2) {
            return  arr;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (SortUtils.less(arr[j],arr[minIndex])) {
                    minIndex = j;
                }
            }
            SortUtils.exch(arr,i,minIndex);
        }
        return arr;
    }
}
