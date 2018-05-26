package hackerrank;

public class ArrayRotation {


    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] m = {0, 1, 2};

        int k = 2;

        for (int i = 0; i < k; i++) {
            a = circularArrayRotation(a, m);
        }

        // 2 3 1
    }

    public static int[] circularArrayRotation(int[] a, int[] m) {

        int temp = a[a.length - 1];

        for (int i = a.length - 1; i >= 1; i--) {
            a[i] = a[i - 1];
        }

        a[0] = temp;

        for (int i = 0; i < m.length; i++) {
            m[i] = a[i];
        }

        return m;

    }

}
