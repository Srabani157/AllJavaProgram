/*
* input = {1,2,3,4,5)
* output = {1, 3, 6, 10, 15}
* Output should be sum of all the other elements to the left of the index.including the current index
*
* */

public class arr {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int len = arr.length;
        int i, j, sum = 0;
        int arr1[] = new int[len];

        for( i = len - 1; i >= 0 ; i--){
            for( j = 0; j <= i ; j++){
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
