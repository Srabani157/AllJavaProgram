package com.array;
/*Find Maximum and Minimum
Write a program to find the maximum and minimum values in an array of integers.*/
public class MaxMin {
    public static void main(String[] args) {
        int arr[] = {10,4,5,15,8};
        int max= arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        for (int j = 1; j < arr.length; j++) {
            if(arr[j]<min){
                min = arr[j];
            }
        }
        System.out.println(+min + " "+max);
    }
}
