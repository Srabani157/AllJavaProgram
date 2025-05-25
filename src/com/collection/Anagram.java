package com.collection;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String s1 = " cat";
        String s2 = "cat ";
        System.out.println(isAnagram(s1, s2));

    }
        public static boolean isAnagram(String s1, String s2){
            HashMap<Character, Integer> hashMap = new HashMap<>();
            HashMap<Character, Integer> hashMap1 = new HashMap<>();
            if(s1.length()!=s2.length()){
                return false;
            } else {
                for (int i = 0; i < s1.length(); i++) {
                    char ch = s1.charAt(i);
                    if (!hashMap.containsKey(ch)) {
                        hashMap.put(ch, 1);
                    } else hashMap.put(ch, hashMap.get(ch) + 1);
                }
                for (int i = 0; i < s2.length(); i++) {
                    char ch = s2.charAt(i);
                    if (!hashMap1.containsKey(ch)) {
                        hashMap1.put(ch, 1);
                    } else hashMap1.put(ch, hashMap1.get(ch) + 1);
                }
            }

            return hashMap.equals(hashMap1);
        }
}
