package com.string;
//sra
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Enter the string to reverse");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = ReverseString(input);
        if (input.equals(result)){
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not Palindrome");

    }
    public static String ReverseString(String input){
        System.out.println(input);
        String s2 = "";
        for(int i = input.length()-1; i >= 0; i--){
            s2 = s2 + input.charAt(i);
        }
        return s2;
    }
}
