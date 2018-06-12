package leetcode;

import java.util.HashMap;


public class RomanNumerals {

    static HashMap<Character, Integer> values;

    public static void main(String[] args) {
        System.out.println(romantToInt("MMMCDXC")); // 3490
        System.out.println(romantToInt("III"));     // 3
        System.out.println(romantToInt("IV"));      // 4
        System.out.println(romantToInt("IX"));      // 9
        System.out.println(romantToInt("LVIII"));   // 58
        System.out.println(romantToInt("MCMXCIV")); // 1994
        System.out.println(romantToInt(""));        // 0
        System.out.println(romantToInt("Q"));       // 0
    }

    public static int romantToInt(String s) {

        if (s.length() <= 0) {
            return 0;
        }

        s = s.toUpperCase();

        // setup hashmap
        if (values == null) {
            values = new HashMap<>();
            values.put('I', 1);
            values.put('V', 5);
            values.put('X', 10);
            values.put('L', 50);
            values.put('C', 100);
            values.put('D', 500);
            values.put('M', 1000);
        }

        int num = 0;
        char curr = s.charAt(s.length() - 1);
        char last;

        for (int i = s.length() - 1; i >= 0; i--) {
            last = curr;
            curr = s.charAt(i);

            // test for special cases
            if (last != -1) {
                if (curr == 'I' && (last == 'V' || last == 'X')) {
                    num -= 1;
                    continue;
                }
                if (curr == 'X' && (last == 'L' || last == 'C')) {
                    num -= 10;
                    continue;
                }
                if (curr == 'C' && (last == 'D' || last == 'M')) {
                    num -= 100;
                    continue;
                }
            }

            Integer val = values.get(curr);
            if (val != null) num += val;

        }

        return num;

    }


}
