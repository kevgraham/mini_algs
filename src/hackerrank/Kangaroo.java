package hackerrank;

public class Kangaroo {

    public static void main(String[] args) {

        System.out.println(kangaroo(0, 3, 4, 2)); // YES
        System.out.println(kangaroo(0, 2, 5, 3)); // NO


    }

    static String kangaroo(int x1, int v1, int x2, int v2) {

        while (x1 != x2) {

            if ((v1 < v2 && x1 < x2) ||   // kangaroo 1 is slower and behind
                    (v2 < v1 && x2 < x1) ||   // kangaroo 2 is slower and behind
                    (v1 == v2)) {             // same speed
                return "NO";
            }

            x1 += v1;
            x2 += v2;
        }

        return "YES";
    }

}
