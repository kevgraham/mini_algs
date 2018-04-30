public class RemoveDuplicatesArray {

    public static void main(String[] args) {

        int[] test = {1, 1, 2};
        removeDuplicates(test);

        System.out.println(test);
    }

    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        int i = 1;

        // iterate until end of new array
        while (i < len) {

            // if there is a duplicate
            if (nums[i] == nums[i-1]) {

                // shift elements backwards
                for (int j = i; j < nums.length; j++) {
                    nums[j - 1] = nums[j];
                }

                // update length
                len--;
            }
            // if there's no duplicate continue iterating
            else {
                i++;
            }
        }

        return len;
    }
}
