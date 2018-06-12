package leetcode;

public class CommonPrefix {


    public static void main(String[] args) {
        String[] test1 = {"flower","flow","flight"};
        String[] test2 = {"dog","racecar","car"};
        String[] test3 = {};
        String[] test4 = {""};
        String[] test5 = {"abab","aba",""};
        String[] test6 = {"a"};

//        System.out.println(longestCommonPrefix(test1)); // "fl"
//        System.out.println(longestCommonPrefix(test2)); // ""
//        System.out.println(longestCommonPrefix(test3)); // ""
//        System.out.println(longestCommonPrefix(test4)); // ""
//        System.out.println(longestCommonPrefix(test5)); // ""
        System.out.println(longestCommonPrefix(test6)); // "a"
    }

    public static String longestCommonPrefix(String[] strs) {

        if (strs.length <= 0) {
            return "";
        }

        int prefix = 0;

        while (true) {

            char c;
            // current char
            if (prefix <= strs[0].length() - 1) {
                c = strs[0].charAt(prefix);
            } else {
                return strs[0].substring(0, prefix);
            }

            // check each String for current char
            for (String s : strs) {
                // first nonmatch
                if (prefix > s.length() - 1 || s.charAt(prefix) != c) {
                    return s.substring(0, prefix);
                }
            }

            // move to next char
            prefix += 1;
        }
    }

}
