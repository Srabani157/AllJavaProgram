public class SumArrr {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int len = arr.length;
        int i, j, sum = 0;
        int arr1[] = new int[len];

        for( i = 0; i < len ; i++){
            for( j = 0; j <= i ; j++){
                sum = sum + arr[i];
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
