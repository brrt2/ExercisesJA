package codingBat;

public class Array_3_CanBalance {

//    Given a non-empty array, return true if there is a place to split the array so that the sum of the
//    numbers on one side is equal to the sum of the numbers on the other side.
//canBalance([1, 1, 1, 2, 1]) → true
//    canBalance([2, 1, 1, 2, 1]) → false
//    canBalance([10, 10]) → true

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 2, 1};
        int[] nums2 = {2,1,1,2,1};
        int[] nums3= {10,10};

        System.out.println(new Array_3_CanBalance().canBalance(nums3));

    }

   private boolean canBalance(int[] nums) {

        int left = 0;
        int right;

        for (int i=0; i < nums.length - 1; i++){
            left+=nums[i];
        }
        right = nums[nums.length - 1];

        for(int i = nums.length - 2; i > 0; i--) {
            if(left == right) return true;
            left-=nums[i];
            right+=nums[i];
        }

        return (left == right);
    }
}
