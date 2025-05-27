package practice.array;

import java.util.HashMap;

public class TwoSum {
  /*  public static void main(String[] args) {
        int[] arr = {1,4,2,7,7};
        int target = 9;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(target == arr[i] + arr[j]){
                    System.out.println("The index values are i : " +i + " and j : " +j);
                }
            }
        }
    }*/
   /*public static void main(String [] p){
        int [] twoSum= {1, 3,9,0,0,2};
        int target = 6;
        for (int i = 0; i < twoSum.length; i++) {
            for (int j = i+1; j < twoSum.length; j++) {
                if(twoSum[i] + twoSum[j] == target){
                    System.out.println("Found the target at i , j : " +i + " , " +j);
                }
            }
        }
       System.out.println("not found");
    }*/
   public static void main(String [] args){
        int [] arr = {1, 3, 9, 0, 2};
       HashMap<Integer, Integer> hashMap = new HashMap<>();
       for (int i = 0; i < arr.length; i++) {
           hashMap.put(arr[i],i);
       }

    }
}
