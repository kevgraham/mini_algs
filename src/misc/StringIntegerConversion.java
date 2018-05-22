package misc;

public class StringIntegerConversion {

    public static void main(String[] args) {
        System.out.println("String to Integer");
        System.out.println(stringToInteger("127"));
        System.out.println(stringToInteger("-127"));
        System.out.println(stringToInteger("0"));
        System.out.println(stringToInteger("1423"));

        System.out.println("Integer to String");
        System.out.println(integerToString(127));
        System.out.println(integerToString(-127));
        System.out.println(integerToString(0));
        System.out.println(integerToString(1423));
    }

    static int stringToInteger(String str) {

        int num = 0;
        int digit;
        int mod = 1;

        for (int i = 0; i < str.length(); i++) {

            // check for minus sign
            if (str.charAt(i) == '-') {
                mod = -1;
                continue;
            }

            // get digit
            digit = str.charAt(i) - '0';
            if (digit < 0 || digit > 9) continue;

            // update number
            num = (num * 10) + digit;
        }

        return num * mod;
    }


    static String integerToString(int num) {
        boolean negative = false;
        if (num < 0) {
            negative = true;
            num = -num;
        }

        int i = 0;
        char[] temp = new char[11];


        do {
            temp[i++] = (char)(num % 10 + '0');
            num /= 10;
        } while (num > 0);

        StringBuilder b = new StringBuilder();

        if (negative) b.append('-');

        while (i > 0) {
            b.append(temp[--i]);
        }

        return b.toString();
    }

}
