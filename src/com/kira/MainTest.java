package com.kira;

import com.kira.common.utils.SortUtils;
import com.kira.sort.InsertSort;
import com.kira.sort.MergeSortTD;
import com.kira.sort.SelectSort;
import com.kira.sort.ShellSort;

public class MainTest {

    public static void testSelectSort(Comparable a[]) {
        SortUtils.show(SelectSort.sort(a));
    }

    public static void testInsertSort(Comparable a[]) {
        SortUtils.show(InsertSort.sort(a));
    }

    public static void testShellSort(Comparable a[]) {
        SortUtils.show(ShellSort.sort(a));
    }

    public static void testMergeSort(Comparable a[]) {
        SortUtils.show(MergeSortTD.sort(a));
    }

    public static void main(String[] args) {
        Integer[] a = {1,4,3,8,2,0,5,42,3,6,12,99,78,45,13,25,2};
        testMergeSort(a);
        //testShellSort(a);
        //testInsertSort(a);
    }
}
