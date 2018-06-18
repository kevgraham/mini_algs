package ctci;

import java.util.HashSet;

public class IsUnique {

    public static void main(String[] args) {
        System.out.println(isUnique("Hello")); // false
        System.out.println(isUnique("House")); // true
    }

    public static boolean isUnique(String str) {

        HashSet<Character> seen = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (seen.contains(c)) {
                return false;
            } else {
                seen.add(c);
            }
        }

        return true;
    }

}
