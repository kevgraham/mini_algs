package ctci;

import java.util.Arrays;

public class CheckPermutations {

    public static void main(String[] args) {
        System.out.println(checkPermutation("aabb", "baba")); // true
        System.out.println(checkPermutation("aaaa", "bbbb")); // false
    }

    public static boolean checkPermutation(String a, String b) {
        a = sortString(a);
        b = sortString(b);
        return a.equals(b);
    }

    private static String sortString(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return Arrays.toString(arr);
    }
}
