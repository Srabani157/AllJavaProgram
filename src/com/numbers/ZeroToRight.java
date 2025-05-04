package com.numbers;

import java.util.Arrays;

public class ZeroToRight {
    public static void main(String[] args) {
        int arr[] = new int[]{0,0,0,1,1,1,1,1,2,0,0,1,1,0,9,0,5};
        int zeroCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                zeroCount++;
        }

        for (int z = 0; z < zeroCount; z++) {

            for (int i = 0; i < arr.length-1; i++) {
                int j = i+1;
                if (arr[i] == 0 && arr[j] != 0) {
                    arr[i] = arr[j];
                    arr[j] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
