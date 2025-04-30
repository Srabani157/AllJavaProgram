package com.string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";
        char[] charArr1 = s1.toCharArray();
        char[] charArr2 = s2.toCharArray();
        Arrays.sort((charArr1));
        Arrays.sort((charArr2));

        if(s1.length() != s2.length())
            System.out.println("Not Anagram");
        else if(charArr1.equals(charArr2))
                System.out.println("Anagram");

        }
    }

