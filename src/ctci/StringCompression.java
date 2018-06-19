package ctci;

public class StringCompression {

    public static void main(String[] args) {
        System.out.println(compress("aabcccccaaa")); // a2b1c5a3
        System.out.println(compress("aabb"));        // aabb
    }

    public static String compress(String s) {
        StringBuilder res = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            count++;

            if (i + 1 >= s.length() ||              // last char or
                    s.charAt(i) != s.charAt(i + 1)) {   // current is not equal to next
                res.append(s.charAt(i));
                res.append(count);
                count = 0;
            }
        }

        String result = res.toString();

        // return shortest String
        return (result.length() < s.length()) ? result : s;

    }
}
