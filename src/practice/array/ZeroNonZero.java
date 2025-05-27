package practice.array;

public class ZeroNonZero {
    /*public static void main(String[] args) {
        int [] arr = {1,0,6,0,2,9,0};
        int [] arr1 = new int[arr.length];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                count ++;
            }
            else {
                arr1[j]= arr[i];
                j++;
            }
        }
        for (int i : arr1){
            System.out.println(i);
        }
    }*/
    public static void main(String[] args) {
        int [] arr1= {1,0,6,0,2,9,0};
        int [] res = new int[arr1.length];
        int j=0;
        for (int i = 0 ; i < arr1.length; i++) {
            if(arr1[i]==0)
                res[j++] = 0;
        }
        for (int i : arr1){
            if(i!=0)
                res[j++]=i;
        }
        for (int i : res){
            System.out.println(i);
        }
    }
}
