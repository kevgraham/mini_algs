package hackerrank;

import java.util.HashMap;

public class BirthdayCake {

    static int birthdayCakeCandles(int n, int[] ar) {
        /*
         * Write your code here.
         */

        int max = ar[0];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            // update map
            if (map.containsKey(ar[i])) {
                int current = map.get(ar[i]);
                map.put(ar[i], current + 1);
            } else {
                map.put(ar[i], 1);
            }

            // update max
            max = (ar[i] > max) ? ar[i] : max;
        }

        return map.get(max);

    }
}
