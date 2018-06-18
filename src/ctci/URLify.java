package ctci;

public class URLify {

    public static void main(String[] args) {
        System.out.println(urlify("Mr John Smith    ", 13));
    }

    public static String urlify(String url, int length) {
        StringBuilder result = new StringBuilder();
        char[] arr = url.toCharArray();

        for (int i = 0; i < length; i++) {
            char c = arr[i];

            if (c == ' ') {
                result.append("%20");
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
