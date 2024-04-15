import java.util.Scanner;

public class S_Reverse1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean isSame;
        System.out.println("\n1.Enter two string to compare\n2.Enter a string to reverse\n3. Enter a Line to " +
                "reverse\n");
        System.out.println("Please enter your choice");
        int ch=sc.nextInt();
        String s1 = "";
        String s2 = "";
        switch(ch){
            case 1:
                System.out.println("Enter two string to compare");
                s1 = sc.next();
                s2 = sc.next();
                compareString(s1,s2);

                break;
            case 2:
                System.out.println("Enter a string to reverse");
                s1 = sc.next();
                sc.nextLine();
                reverseString(s1);
                break;
            case 3:
                System.out.println("Enter a Line to reverse");
                sc.nextLine();
                s1 = sc.nextLine();
                reverseLine(s1);
                break;
            case 4:
                System.out.println("Happy Happy");
                break;
            default:
        }
    }



    private static void compareString(String s1, String s2){

        int i;
        Boolean isSame = false;
        int len1 = getLength(s1);
        int len2 = getLength(s2);
        if(len1 == len2 ) {
            for (i = 0; i < len1; i++) {
                if(s1.charAt(i) == s2.charAt(i))
                    isSame=true;
                else
                    isSame=false;
                    break;

            }
            System.out.println("NOT SAME");
        }
        if (isSame)
            System.out.println("SAME");
        else
            System.out.println("NOT SAME");


    }
    // I Like Java ---> avaJ ekiL I
    private static void reverseString(String s1) {
        String s2 = "";
        int len1 = getLength(s1);
        System.out.print("The Reverse String Is: ");
        for (int i = len1-1; i >= 0; i--) {
            char ch = s1.charAt(i);
            s2 = s2+ch;
        }
        System.out.println(s2);
    }
    // // I Like Java ---> I ekiL avaJ
    private static void reverseLine(String s1) {
        String s2 = "";
        int i , j,n ;
        char ch;
        System.out.print("Enter the line to reverse: "); // I love Java
        String[] arr = s1.split(" ");
        int len = arr.length;
        for (i = 0; i < len; i++) {
            n = arr[i].length();
            for(j= n-1 ; j >= 0 ; j--) {
                 ch = arr[i].charAt(j);
                 s2 = s2+ch;
            }
            if(i < len)
            s2 = s2 + "_";

             }
        System.out.print(s2);

        }


    private static int getLength(String s1) {
        int len = s1.length();
        return len;
    }

}
