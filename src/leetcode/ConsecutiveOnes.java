package leetcode;

public class ConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {

        int max = 0;
        int cur = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cur++;
            }
            else {
                // set new max
                if (cur > max) {
                    max = cur;
                }
                // reset cur
                cur = 0;
            }
        }


        if (cur > max) {
            max = cur;
        }

        return max;
    }

}
