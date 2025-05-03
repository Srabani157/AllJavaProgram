/*Write a program to merge two array lists [a,b,c] [1,2,3].
Output should be [a,1,b,2,c,3]. Result arraylist should be of size 6.*/
package com.collection;

import java.util.ArrayList;

public class MergeArrayList {
    public static void main(String[] args) {
        ArrayList<Character> arrayList = new ArrayList<>();
        ArrayList<Character> arrayList2 = new ArrayList<>();
        arrayList.add('a');
        arrayList.add('b');
        arrayList.add('c');
        arrayList2.add('1');
        arrayList2.add('2');
        arrayList2.add('3');
        arrayList.addAll(arrayList2);
        System.out.println(arrayList);
    }
}
