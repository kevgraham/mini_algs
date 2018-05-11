package misc;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(6));
    }

    public static int fibonacci(int n) {

        // ensure proper usage
        if (n <= 0) {
            return 0;
        }

        // base case
        else if (n == 1) {
            return 1;
        }
        // recursion
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
