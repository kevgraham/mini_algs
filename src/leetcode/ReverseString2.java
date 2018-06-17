package leetcode;

public class ReverseString2 {


    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 4)); // dcbaefg
    }

    public static String reverseStr(String s, int k) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i <= s.length() / k; i++) {

            // get current section
            int begIndex = i * k;
            int endIndex = (i * k <= s.length() - k) ? i * k + k : s.length(); // accounts for partial section
            String section = s.substring(begIndex, endIndex);

            // reverse section
            if (i % 2 == 0) {
                result.append(reverseHelper(section));
            }
            // don't reverse section
            else {
                result.append(section);
            }

        }

        return result.toString();
    }

    public static String reverseHelper(String s) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            result.insert(0, c);
        }

        return result.toString();
    }
}
