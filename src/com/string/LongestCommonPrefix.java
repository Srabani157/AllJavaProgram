package com.string;

class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String res = longestCommonPrefix(strs);
        System.out.println(res);
    }

    public static String longestCommonPrefix(String[] strs) {
        int count = 0;
        String s1 = "";
        String s2,s3;

        for (int i = 0; i < strs.length - 1; i++) {
            s1 = strs[i];
            s2 = strs[i + 1];
            int len = Math.min(s1.length(), s2.length());

            for (int j = 0; j < len; j++) {
                if (s1.charAt(j) == s2.charAt(j)) {
                    count ++;
                    
                    //fcount = Math.min(fcount, count);
                }
                //fcount = count;
                else break;
            }
        }
        return "";

    }

}



