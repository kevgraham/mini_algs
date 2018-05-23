package misc;

import java.util.HashMap;

public class TelephoneIntepreter {

    private static HashMap<Integer, char[]> keys = new HashMap<>();


    private static final int PHONE_NUMBER_LENGTH = 7;
    private static char[] result = new char[PHONE_NUMBER_LENGTH];

    public static void main(String[] args) {
        buildKey();

        // test
        System.out.println(getCharKey(3, 2)); // E

        for (int i = 2; i <= 9; i ++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(getCharKey(i, j) + " ");
            }
        }
        System.out.println();

        int[] test = {2, 2, 3, 4, 5, 6, 7, 8};
        printTelephoneWords(test);
        //printIterative(test);
    }

    public static void printIterative(int[] number) {

        int lastIndex = PHONE_NUMBER_LENGTH - 1;

        // build first
        for ( int i = 0; i <= lastIndex; i++) {
            result[i] = getCharKey(number[i], 1);
        }

        int count = 0;

        // while the last iteration hasn't been reached
        while(true) {

            // print
            System.out.println(result);
            count++;

            // update char
            for (int i = lastIndex; i >= -1; --i) {

                if (i == -1) {
                    System.out.println("Count: " + count);
                    return;
                }

                if (result[i] == getCharKey(number[i], 3)) {
                    result[i] = getCharKey(number[i], 1);
                } else if (result[i] == getCharKey(number[i], 1)) {
                    result[i] = getCharKey(number[i], 2);
                    break;
                } else if (result[i] == getCharKey(number[i], 2)) {
                    result[i] = getCharKey(number[i], 3);
                    break;
                }

            }

        }

    }

    public static void printTelephoneWords(int[] number) {
        int count = printHelper(number, 0, 0);
        System.out.println("Count: " + count);
    }

    private static int printHelper(int[] number, int digit, int count) {
        // base case
        if (digit == PHONE_NUMBER_LENGTH) {
            System.out.println(new String(result));
            count++;
            return count;
        }
        // iterate through places
        for (int i = 1; i <= 3; ++i) {
            // replace current digit
            result[digit] = getCharKey(number[digit], i);
            count = printHelper(number, digit + 1, count);

            // skip 0 and 1
            if (number[digit] == 0 || number[digit] == 1) {
                return count;
            }
        }

        return count;
    }

    private static char getCharKey(int telephoneKey, int place) {
        if (telephoneKey < 2 || telephoneKey > 9) {
            return ' ';
        }
        if (place < 1 || place > 3) {
            return ' ';
        }

        return keys.get(telephoneKey)[place - 1];
    }

    private static void buildKey() {

        char[] two = {'A', 'B', 'C'};
        keys.put(2, two);

        char[] three = {'D', 'E', 'F'};
        keys.put(3, three);

        char[] four = {'G', 'H', 'I'};
        keys.put(4, four);

        char[] five = {'J', 'K', 'L'};
        keys.put(5, five);

        char[] six = {'M', 'N', 'O'};
        keys.put(6, six);

        char[] seven = {'P', 'R', 'S'};
        keys.put(7, seven);

        char[] eight = {'T', 'U', 'V'};
        keys.put(8, eight);

        char[] nine = {'W', 'X', 'Y'};
        keys.put(9, nine);

    }

}
