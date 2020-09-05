package com.kira.sort;

import com.kira.common.utils.SortUtils;

public class ShellSort {

    public static Comparable[] sort(Comparable[] a) {
        if (a.length < 2) {
            return a;
        }
        int n = a.length;
        for (int step = n/3; step >=1; step/=3) {
            for (int i = step; i<n; i++) {
                for (int j=i; j>=step && SortUtils.less(a[j],a[j-step]); j-=step) {
                    SortUtils.exch(a,j,j-step);
                }
            }
        }
        return a;
    }

//    public static Comparable[] sort(Comparable[] a) {
//        if (a.length < 2){
//            return a;
//        }
//        for(int step = a.length/3; step>=1; step/=3) {
//            for(int i = step; i < a.length;i++) {
//                for (int j = i; j>step && SortUtils.less(a[j],a[j-step]); j-=step) {
//                    SortUtils.exch(a,j,j-step);
//                }
//            }
//        }
//        return a;
//    }
}
