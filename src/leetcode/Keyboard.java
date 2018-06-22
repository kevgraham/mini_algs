package leetcode;

import java.util.ArrayList;

public class Keyboard {

    public static void main(String[] args) {
        String[] test1 = {"Hello", "Alaska", "Dad", "Peace"}; // {"Alaska", "Dad"}
        System.out.println(findWords(test1));
    }

    public static String[] findWords(String[] words) {

        ArrayList<String> result = new ArrayList<>();

        for (String s : words) {
            if (testWord(s)) {
                result.add(s);
            }
        }

        return result.toArray(new String[result.size()]);
    }

    private static boolean testWord(String word) {
        // array  0 - 12  A, B, C, D, E, F, G, H, I, J, K, L, M
        int[] keyboard = {2, 3, 3, 2, 1, 2, 2, 2, 1, 2, 2, 2, 3,
                // array 13 - 25  N, O, P, Q, R, S, T, U, V, W, X, Y, Z
                3, 1, 1, 1, 1, 2, 1, 1, 3, 1, 3, 1, 3};

        // convert to lowercase char array
        char[] chars = word.toLowerCase().toCharArray();

        for (int i = 1; i < chars.length; i++) {
            if (keyboard[chars[i] - 97] != keyboard[chars[i - 1] - 97]) {
                return false;
            }
        }

        return true;
    }
}
