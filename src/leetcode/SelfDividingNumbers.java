package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

    public static List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> result = new ArrayList<>();

        // iterate from beginning to end of boundary
        for (int i = left; i <= right; i++) {

            int num = i;
            boolean pass = true;

            // iterate through digits
            while (num > 0) {
                int digit = num % 10;

                // cannot contain zero
                if (digit == 0) { pass = false; break; }

                // check if i is not divisible by digit
                if (i % digit != 0) { pass = false; break; }

                num /= 10;
            }

            // add self-dividing number to list
            if (pass == true) { result.add(i); }
        }
        return result;
    }

}
