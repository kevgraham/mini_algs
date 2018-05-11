package leetcode;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(123454321)); // true
        System.out.println(isPalindrome(10));        // false
        System.out.println(isPalindrome(121));       // true
        System.out.println(isPalindrome(-121));      // false
    }

    public static boolean isPalindrome(int x) {

        int temp = x;
        int reverse = 0;

        // reverse input
        while (temp > 0) {

            // get last digit
            int last = temp % 10;

            // append to beginning
            reverse = (reverse * 10) + last;

            // move to next digit
            temp /= 10;
        }

        // check if reverse matches original
        if (reverse == x) {
            return true;
        }

        return false;
    }

}
