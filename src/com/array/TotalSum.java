/*1.    Sum of Elements
WAP to take an array of integers as input and calculate the sum of all elements in the array.*/
package com.array;

class TotalSum {
    public static void main(String[] args) {
        int arr[] = {1,4,5,7,8};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

}
