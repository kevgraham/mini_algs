public class ReverseInteger {


    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
        System.out.println(reverse(-1563847412));
    }

    public static int reverse(int x) {
        long reverse = 0;
        int temp = x;

        // reverse input
        while (Math.abs(temp) > 0) {

            // get last digit
            int last = temp % 10;

            // append to beginning
            reverse = (reverse * 10) + last;

            // move to next digit
            temp /= 10;
        }

        // check overflow
        if (Math.abs(reverse) > Integer.MAX_VALUE) {
            return 0;
        }

        return (int)reverse;
    }
}
