package com.kira.sort;

public class FastSort {
    public static int[] sort(int[] array, int start, int end) {
        if (array.length < 1 || start < 0 || end >= array.length || start > end)
            return null;

        //分割指示器
        int zoneIndex = partition(array,start,end);
        if(zoneIndex > start) {
            sort(array,start,zoneIndex-1);
        }
        if (zoneIndex<end) {
            sort(array,zoneIndex+1,end);
        }
        return array;
    }

    public static int[] sort(int[] array) {
        return sort(array,0,array.length-1);
    }
    public static int partition(int[] array,int start,int end) {
        int pivot = (int)(start + Math.random()*(end-start+1));
        int zoneInex = start-1;
        //交换
        int temp = array[pivot];
        array[pivot] = array[end];
        array[end] = temp;
        for (int i =start;i<=end;i++) {
            if (array[i] <= array[end]) {
                zoneInex++;
                if (i>zoneInex) {
                    int temp2 = array[i];
                    array[i] = array[zoneInex];
                    array[zoneInex] = temp2;
                }
            }
        }
        return zoneInex;
    }
}
