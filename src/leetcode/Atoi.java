package leetcode;

public class Atoi {

    public static void main(String[] args) {
        System.out.println(myAtoi("3.14159"));
        System.out.println(myAtoi("      -11919730356x"));
        System.out.println(myAtoi("9223372036854775808")); // 2147483647
        System.out.println(myAtoi("2147483648"));          // 2147483647
        System.out.println(myAtoi("-91283472332"));        // -2147483648
        System.out.println(myAtoi("42"));                  // 42
        System.out.println(myAtoi("-42"));                 // -42
        System.out.println(myAtoi("4193 with words"));     // 4193
        System.out.println(myAtoi("words and 987"));       // 0
        System.out.println(myAtoi("+-42"));                // 0
        System.out.println(myAtoi("   +0 123"));           // 0

    }

    public static int myAtoi(String str) {
        // ensure proper usage
        if (str.length() == 0) {
            return 0;
        }

        int sign = 1;
        double num = 0;
        boolean started = false;

        // iterate through chars
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // check for whitespace
            if (c == ' ' && started == false) {
                continue;
            }
            // check for positive
            else if (c == '+' && started == false) {
                started = true;
                continue;
            }
            // check for negative
            else if (c == '-' && started == false) {
                started = true;
                sign = -1;
            }
            // check for digit
            else if (Character.isDigit(c)) {
                started = true;
                // add digit to num
                    num = (num * 10) + Character.getNumericValue(c);
            }
            // non whitespace
            else  {
                break;
            }
        }

        num *= sign;

        // check boundaries
        if (num < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (num > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        return (int)num;
    }
}
