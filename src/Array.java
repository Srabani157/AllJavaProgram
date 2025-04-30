public class Array {

        public static int[] twoSum(int[] nums, int target) {
            int num;
            for (int i = 0 ; i <= nums.length; i++) {
                if (nums[i] < target) {
                     num = target - nums[i];

                    int[][] arr = new int[0][];
                    if(target-num == 0 )
                        return new int[]{arr[i][num]};
                }
            }
            return nums;
        }
            public static void main(String[] args){
                int[] nums = {2,7,11,15};
                int target = 9;
                int[] arr = twoSum(nums, target);
                System.out.println(arr);
            }


    }


