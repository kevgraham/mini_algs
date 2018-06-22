package leetcode;

public class MountainPeak {

    public static void main(String[] args) {
        int[][] tests = {{0,1,0},          // 1
                        {0, 2, 1, 0},      // 1
                        {0, 0, 0, 0},      // 0
                        {3, 2, 1, -1},     // 0
                        {-3, -2, -1, -4}}; // 2

        for (int[] test : tests) {
            System.out.println(peakIndexInMountainArray(test));
        }
    }

    public static int peakIndexInMountainArray(int[] A) {

        int maxIndex = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > A[maxIndex]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}
