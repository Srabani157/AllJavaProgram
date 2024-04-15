/*
* input = {1,2,3,4,5)
* output = {1, 3, 6, 10, 15}
* Output should be sum of all the other elements to the left of the index.including the current index
*
* */

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        multiplication(num);


    }

    /*To Print Multiplication table of any number*/
    public static void multiplication(int num){

        int i,q;
        for(i = 1 ; i <= 10 ; i++){
            q = num * i ;
            System.out.println(num + "*" + +i + "=" +q);
        }


    }
}
