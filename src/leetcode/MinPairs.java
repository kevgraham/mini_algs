package leetcode;

import java.util.Arrays;

public class MinPairs {

    public static void main(String[] args) {
        int[] test = {1,4,3,2};
        System.out.println(arrayPairSum(test));
    }

    public static int arrayPairSum(int[] nums) {
        int result = 0;

        // sort
        Arrays.sort(nums);

        // add every other num
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                result += nums[i];
            }
        }

        return result;
    }
}
