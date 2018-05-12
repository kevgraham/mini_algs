package hackerrank;

public class Staircase {

    static void staircase(int n) {
        /*
         * Write your code here.
         */

        // iterate through rows
        for (int row = 1; row <= n; row++) {
            // iterate through columns
            for (int col = 1; col <= n; col++) {
                if (col > n - row) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
