package hackerrank;

public class MinMaxSum {

    static void miniMaxSum(int[] arr) {

        int min = arr[0];
        int max = arr[0];
        long sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            sum += val;

            if (val < min) min = val;
            if (val > max) max = val;

        }

        System.out.print(sum - max); // min
        System.out.print(" ");
        System.out.print(sum - min); // max
    }
}
