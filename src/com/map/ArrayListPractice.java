package com.map;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        /*
         * ArrayList / List Practice
         * Store and display 10 student names using ArrayList.
         * Reverse a list of integers.
         * Find the maximum and minimum elements in an ArrayList<Integer>.
         * Remove all even numbers from a list of integers.
         * Check if a list contains a specific element.*/
        //printValues();
        // reverseInt();
        //removeEven();
        // findMaxMin();

    }

    public static void printValues() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Orange");
        arrayList.add("Lichi");
        arrayList.add("Banana");
        System.out.println(arrayList);
    }

    public static void reverseInt() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(1);
        arrayList.add(9);
        int j = arrayList.size() - 1;
        for (int i : arrayList) {
            if (j >= 0)
                System.out.println(arrayList.get(j));
            j--;
        }
    }

    public static void removeEven() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(10);
        arrayList.add(9);
       /* for(int i = arrayList.size() - 1; i >=0; i--){
            if (arrayList.get(i) % 2  == 0) {
                arrayList.remove(i);
            }
        }
        System.out.println(arrayList);*/
        arrayList.removeIf(n -> n % 2 == 0);
        System.out.println(arrayList);

    }

    public static void searchElement() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(11);
        arrayList.add(9);
    }

    public static void findMaxMin() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(11);
        arrayList.add(9);
        int max = arrayList.getFirst();
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i) > max) {
                max = arrayList.get(i);
            }
        }
        System.out.println(max);
    }


}
