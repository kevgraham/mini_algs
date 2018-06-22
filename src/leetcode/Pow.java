package leetcode;

public class Pow {

    public static void main(String[] args) {
        System.out.println(myPow(2, -2147483648));  // 0.0
        System.out.println(myPow(-1, -2147483648)); // 1.0
        System.out.println(myPow(2, -1));           // 0.5
        System.out.println(myPow(2, 2));            // 4.0
        System.out.println(myPow(2, 0));            // 1.0
        System.out.println(myPow(2, 5));            // 32.0
    }

    public static double myPow(double x, int n) {

        if (n < 0) {
            if (n == Integer.MIN_VALUE) {
                n = Integer.MAX_VALUE;

                if (x == -1) return 1;
            }
            else {
                n = -n;
            }

            x = 1 / x;
        }

        if (n == 0) {
            return 1;
        }

        if (n == 1) {
            return x;
        }

        double temp = myPow(x, n / 2);
        return (n % 2 == 0) ? temp * temp : temp * temp * x;
    }
}
