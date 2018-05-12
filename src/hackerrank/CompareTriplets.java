package hackerrank;

public class CompareTriplets {

    /*
     * Complete the solve function below.
     */
    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
        /*
         * Write your code here.
         */

        int[] a = {a0, a1, a2};
        int[] b = {b0, b1, b2};

        int score1 = 0;
        int score2 = 0;

        for (int i = 0; i <= 2; i++) {
            if (a[i] > b[i]) { score1++; }
            if (b[i] > a[i]) { score2++; }
        }

        int[] result = {score1, score2};
        return result;
    }

}
