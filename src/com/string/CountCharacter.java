package com.string;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        String input = "AZaz09 *)";
        int vowel = 0, consonant = 0, number = 0, specialChar = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                if ("AEIOUaeiou".indexOf(ch)>-1)
                    vowel++;
                else
                    consonant++;
            }
            else if(ch >= '0' && ch <= '9')
                number++;
            else
                specialChar++;
        }
        System.out.println("vowel " + vowel);
        System.out.println("consonant " + consonant);
        System.out.println("number " + number);
        System.out.println("specialChar " + specialChar);
    }


}

