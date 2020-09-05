package com.kira.sort;

import com.kira.common.utils.SortUtils;
import com.kira.sort.*;

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

    public static void testMergeSortBU(Comparable a[]) {
        SortUtils.show(MergeSortBU.sort(a));
    }

    public static void testBubbleSort(Comparable a[]) {
        SortUtils.show(BubbleSort.sort(a));
    }

    public static void testChooseSort(Comparable a[]) {
        SortUtils.show(ChooseSort.sort(a));
    }

    public static void testFastSort(int[] a) {
        SortUtils.show(FastSort.sort(a));
    }

    public static void main(String[] args) {
        Integer[] a = {1,4,3,8,2,0,5,42,3,6,12,99,78,45,13,25,2};
        int[] b = {1,4,3,8,2,0,5,42,3,6,12,99,78,45,13,25,2};
        //testMergeSortBU(a);
        //testChooseSort(a);
        //testBubbleSort(a);
        //testMergeSort(a);
        testFastSort(b);
        //testShellSort(a);
      //testInsertSort(a);
    }
}
