/*
 * input = {1,2,3,4,5)
 * output = {14, 13, 12 ,11, 10}
 * Output should be sum of all the other elements except the current index. 0th index should be sum of all the elements
 * except the arr[0] and so on
 *
 * */
public class SumAr {
    public static void main(String [] args){
        int arr[] = {1, 2, 3, 4, 5};
        int i, j, sum = 0;

        int len = arr.length;
        int[] arr1 = new int[len];

        for (i = 0; i < len ; i++){
            for (j = 0; j < len ; j++){
                if(i!=j)
                    sum = sum + arr[j];
            }
            arr1[i]=sum;
            sum = 0;
        }
        //To print the array
        for( i = 0; i < len ; i++){
            System.out.println(arr1[i]);
        }

    }
}
