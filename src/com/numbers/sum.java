package com.numbers;

public class sum {
    public static void main(String[] args) {
        int i = 2 , j = 6 , k = -1, sum = 0;
        for (int a = i ; a <= j ; a++){
            sum =sum + a;
        }
        for (int b = (j-1); b >= k; b--){
            sum += b;
        }
        System.out.println(sum);
}
}