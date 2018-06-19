package ctci;

import java.util.HashMap;

public class PalindromePermutations {

    public static void main(String[] args) {
        System.out.println(isPalindrome("Tact Coa")); // true
        System.out.println(isPalindrome("ABCD"));
    }
    public static boolean isPalindrome(String s) {
        // normalize String
        s = s.toLowerCase();

        HashMap<Character, Integer> seen = new HashMap<>();

        for (char c : s.toCharArray()) {
            // skip non alpha
            if (!Character.isAlphabetic(c)) {
                continue;
            }

            // add odd appearance
            if (seen.get(c) == null) {
                seen.put(c , 1);
            }
            // remove even appearance
            else {
                seen.remove(c);
            }
        }

        // check if there is at most 1 odd char
        return seen.size() <= 1;
    }

}
