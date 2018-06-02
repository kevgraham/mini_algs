package misc;

import java.util.HashSet;

public class SumK {

    public static void main(String[] args) {
        int[] test1 = {10, 15, 3, 7};
        System.out.println(KSum(test1, 17));  // true

        int[] test2 = {5, 10, 15};
        System.out.println(KSum(test2, 3));   // false

        int[] test3 = {};
        System.out.println(KSum(test3, 5));   // false
    }

    public static boolean KSum(int[] array, int k) {

        HashSet<Integer> complements = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            if (complements.contains(k - array[i])) {
                return true;
            }
            complements.add(array[i]);
        }

        return false;
    }
}
