package com.kira;

import com.kira.common.utils.SortUtils;
import com.kira.sort.InsertSort;
import com.kira.sort.SelectSort;

public class MainTest {

    public static void testSelectSort() {
        Integer[] a = {1,4,3,8,2,0,5,42,3,6};
        SortUtils.show(SelectSort.sort(a));
    }

    public static void testInsertSort() {
        Integer[] a = {1,4,3,8,2,0,5,42,3,6,12,99,78,45,13,25,2};
        SortUtils.show(InsertSort.sort(a));
    }

    public static void main(String[] args) {
        testInsertSort();
    }
}
