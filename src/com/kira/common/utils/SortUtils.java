package com.kira.common.utils;

public class SortUtils {

    //比较v是否比w小
    public static boolean less(Comparable v,Comparable w) {
        return v.compareTo(w) < 0;
    }

    //交换数组i和j的位置
    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    /**
     * 在单行中打印数组
     * @param a 数组
     */
    public static void show(Comparable[] a) {
        for (Comparable comparable : a) {
            System.out.print(comparable + " ");
        }
    }

    /**
     * 在单行中打印数组
     * @param a 数组
     */
    public static void show(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i],a[i-1])) {
                return false;
            }
        }
        return true;
    }
}
