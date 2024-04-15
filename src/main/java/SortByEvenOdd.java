import java.util.Scanner;

public class SortByEvenOdd {
    public static void main(String[] args) {
        int i, j = 0, total;
        Boolean flag = false;
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 3, 4, 5, 6, 9, 8};
        total = arr.length;
        int[] arr1 = new int[total];

        for (i = 0; i < total; i++) {
            flag = isEven(arr[i]);

            if (flag == true) {
                arr1[j] = arr[i];
                j++;
            }
        }
        for (i = 0; i < total; i++) {
            flag = isEven(arr[i]);

            if (flag == false) {
                arr1[j] = arr[i];
                j++;
            }
        }

        for (i = 0; i < j; i++) {
                System.out.println(arr1[i]);
            }

        }

    static Boolean isEven(int num) {

        if (num % 2 == 0){
            return true;
        }


        return false;
    }
}