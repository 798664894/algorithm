package com.kira.sort;

import com.kira.common.utils.SortUtils;

public class ShellSort {

    public static Comparable[] sort(Comparable[] a) {
        int n = a.length;
        for (int step = n/3; step >=1; step/=3) {
            for (int i = step; i<n; i++) {
                for (int j=i; j>step && SortUtils.less(a[j],a[j-step]); j-=step) {
                    SortUtils.exch(a,j,j-step);
                }
            }
        }
        return a;
    }
}
