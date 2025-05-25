package com.collection;

import java.util.HashMap;
import java.util.Map;

class StringOccurence{
    public static void main(String[] args) {
        String str = "arpan is a good boy aaa!!!";
        HashMap<Character, Integer> arpan = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!arpan.containsKey(ch)){
                arpan.put(ch, 1);
            }
            else
                arpan.put(ch,arpan.get(ch)+1);
        }
        for(Map.Entry entry : arpan.entrySet()){
            System.out.println("The occurance of '" +entry.getKey() +"' is " +entry.getValue());
        }

    }
}