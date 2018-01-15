package codingBat;


//Given two arrays of ints sorted in increasing order, outer and inner,
//return true if all of the numbers in inner appear in outer. The best solution makes only a single
//"linear" pass of both arrays,taking advantage of the fact that both arrays are already in sorted order.

//linearIn([1, 2, 4, 6], [2, 4]) → true
//linearIn([1, 2, 4, 6], [2, 3, 4]) → false
//linearIn([1, 2, 4, 4, 6], [2, 4]) → true

public class Array_3_linearIn {

    public static void main(String[] args) {

        int[] nums = {1, 2, 4, 6};
        int[] nums2 = {2, 4};

        Array_3_linearIn app = new Array_3_linearIn();
        System.out.println(app.linearIn(nums, nums2));

    }

    public boolean linearIn(int[] outer, int[] inner) {
        if (inner.length == 0) {
            return true;
        }

        int j = 0;
        for (int i = 0; i < outer.length; i++) {
            if (outer[i] == inner[j]) j++;
            if (j == inner.length) return true;
        }
        return false;
    }
}
