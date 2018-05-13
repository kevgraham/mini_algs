package hackerrank;

import java.text.DecimalFormat;

public class PlusMinus {

    static void plusMinus(int[] arr) {
        /*
         * Write your code here.
         */

        float pos = 0;
        float neg = 0;
        float zero = 0;
        float total = arr.length;

        for (int i : arr) {
            if (i > 0) pos++;
            else if (i < 0) neg++;
            else zero++;
        }

        DecimalFormat df = new DecimalFormat("#.######");

        System.out.println(df.format(pos / total));
        System.out.println(df.format(neg / total));
        System.out.println(df.format(zero / total));
    }
}
