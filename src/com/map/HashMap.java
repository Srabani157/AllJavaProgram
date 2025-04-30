package com.map;

import java.util.HashMap;
import java.util.Map;

class RomanToInt {
    public static void main(String[] args) {
        int res = romanToInt("MCMXCIV");
        System.out.println(res);
    }

    public static int romanToInt(String s) {
        int res = 0, j = 0, k;
        char[] charArray = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for (int i = 0; i < charArray.length; i++) {
            if(i==charArray.length-1){
                res = res + map.get(charArray[i]);
            }
            else
            j = map.get(charArray[i]);
            k = map.get(charArray[i + 1]);
            if (j >= k)
                res = res + j;
            else {
                res = res + (k - j);
                i=i+1;
            }
        }
        return res;
    }

}
