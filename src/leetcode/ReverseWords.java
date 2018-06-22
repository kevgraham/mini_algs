package leetcode;

public class ReverseWords {

    public static void main(String[] args) {
        System.out.println("|" + reverseWords("   a   b ") + "|");

    }

    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] arr = s.split(" ");

        for (String str : arr) {
            if (str.length() > 0) {
                result.insert(0, str.trim());
                result.insert(0, " ");
            }
        }

        return result.toString().trim();
    }
}
