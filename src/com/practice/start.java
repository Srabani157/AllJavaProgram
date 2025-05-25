package com.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class start {
    public static void main(String[] args) {
        // evenOdd(5);
        //  multiplicationTable(7);
        //  reverseString();
        //stringReverse1();
        //palindrome();
        //System.out.println(pointerPalindrome());
       // removeExtra();
        //reverseWithFixPosition();
        //countWordsInAString();
        //maxRepeatWOrd();
        //longestSubstring();

    }

    public static void evenOdd(int a) {
        if (a == 1)
            System.out.println("not");
        if (a % 2 == 0)
            System.out.println("even");
        else if (a % 2 == 1) {
            System.out.println("odd");
        }
    }

    public static void multiplicationTable(int a) {

    }


    public static void reverseString() {
        String input = "arpan";
        String res = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == 'p') {
                break;
            }
            res = res + input.charAt(i);
        }
        System.out.println(res);
    }

    public static void stringReverse1() {
        String input = "arpan";
        char[] charInput = input.toCharArray();
        char[] reverse = new char[charInput.length];
        int i = charInput.length - 1;
        for (char ch : charInput) {
            reverse[i] = ch;
            i--;
        }
        System.out.println(reverse);
    }

    public static void palindrome() {
        String s = "abba";
        char[] charStr = s.toCharArray();
        char[] result = new char[charStr.length];
        int i = charStr.length - 1;
        for (char ch : charStr) {
            result[i] = ch;
            i--;
        }
        if (Arrays.equals(result, charStr)) {
            System.out.println("Palindrome");
        } else
            System.out.println("Not Palindrome");
    }

    public static boolean pointerPalindrome() {
        String input = "";
        int len = input.length();
        for (int i = 0, j = (len - 1); i < (len / 2); i++, j--) {
                if (input.charAt(i) != input.charAt(j)) {
                    return false;
                }
            }
       return true;
    }

    public static void removeExtra(){
        String str = "   this  is    a string      .   ";
        str = str.trim();
        String s2= null;
      /*  String [] arr = str.split("\\s+");
        for(String i : arr){
            System.out.print(i + " ");

        }*/
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==' '){

            }
        }
    }
    public static void reverseWithFixPosition(){
        String input = "Hello World";
        String rev = "";
        String [] arr = input.split("\\s+");
        int j=0;
        for (int i = arr.length - 1; i >= 0  ; i--) {
            j = arr[i].length()-1;
            while(j>=0) {
                rev = rev + arr[i].charAt(j);
                j--;
            }
            rev+=" ";
            }
        System.out.print(rev);
        }

    public static void countWordsInAString(){
        String s = "This is a sample string";
        String [] s1 = s.split(" ");
        System.out.println(s1.length);
    }
    public static void maxRepeatWOrd(){
        String s = "This is a sample string sample sample";
        String [] s1 = s.split(" ");
        HashMap<String,Integer> hm = new HashMap<>();
        for(String input : s1) {
            if(!hm.containsKey(input))
                hm.put(input,1);
            else
                hm.put(input,hm.get(input)+1);
        }
        int max = Integer.MIN_VALUE;
        for(Map.Entry<String,Integer> entry : hm.entrySet()) {
            if(entry.getValue()>max)
                max = entry.getValue();
        }
        String val = null;
        for (Map.Entry<String,Integer> e : hm.entrySet()) {
            if(e.getValue().equals(max))
                 val = e.getKey();
        }
        System.out.println(val);
    }

 /*   public static void longestSubstring() {
        String str = "geeksforgeeks"; //output - eksforg
        String str1 = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
          ch = str.charAt(i);
          if(ch!=str1.contains(i))
                str1 = str1 + ch;

            }
    }*/



}

