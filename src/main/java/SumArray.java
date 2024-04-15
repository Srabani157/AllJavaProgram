/*Sum to the right of the array*/

public class SumArray {

    //[1,2,3,4,5]= 15,14,12,9,5
    // i[0] = i0+i1+i2
    //i[1]= i1+i2+i3
    //i[2] = i2+i3
    public static void main(String[] args) {
        int i,sum=0;
        int[] arr = {1, 2, 3, 4, 5};
        int total = arr.length;//5
        int[] result = new int[total];
        for (i = 0; i < total; i++) {
            for (int j = i; j < total; j++) {
                sum = sum + arr[j];//1,
            }
            result[i] = sum;
            sum = 0;

        }

        for (i = 0; i < total; i++) {
            System.out.println(result[i]);
        }
    }
}
