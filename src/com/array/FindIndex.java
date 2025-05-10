package com.array;
public class FindIndex {
    public static void main(String[] args) {
        int [] arr = {7, 1, 2, 7, 7, 4, 5, 6};
        int element = 7;
        int j = 0 ;
        int [] indexArray = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == element) {
                indexArray[j] = i;
                j++;
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.println(indexArray[i]);
        }
    }

}

