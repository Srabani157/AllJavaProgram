package com.array;

import java.util.Arrays;

/*Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
Output: arr[] = [1, 2, 4, 3, 5, 0, 0, 0]*/
public class SeparateZeroAndNonZero {
    public static void main(String[] args) {
        int [] zeroArray = {0};
        int [] nonZeroArray = new int[zeroArray.length];
        int j = 0;
        for (int i = 0; i < zeroArray.length; i++) {
            if (zeroArray[i] != 0){
                nonZeroArray[j] = zeroArray[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(nonZeroArray));
    }
}
