package com.kira.sort;

import com.kira.common.utils.SortUtils;

public class SelectSort {

    /**
     *选择排序
     * 找出数组最小的元素，放在第一的位置
     * 依次找出剩下数组的最小元素放在第一个
     * 时间复杂度O(n^2)
     */
    public static Comparable[] sort(Comparable[] inArr) {

        for (int i = 0; i < inArr.length; i++) {
            int min = i;
            for (int j = i+1; j < inArr.length; j++) {
                if (SortUtils.less(inArr[j],inArr[min])) {
                    min = j;
                }
            }
            SortUtils.exch(inArr,i,min);
        }
        return inArr;
    }
}
