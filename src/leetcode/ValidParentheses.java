package leetcode;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid(")"));         // true
        System.out.println(isValid("()[]{}"));     // true
        System.out.println(isValid(""));           // true
        System.out.println(isValid("(]"));         // false
        System.out.println(isValid("([)]"));       // false
        System.out.println(isValid("{[]}"));       // true
    }




    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        if (s.length() == 0) {
            return true;
        }

        for (int i = 0; i < s.length(); i++) {

            char curr = s.charAt(i);

            switch (curr) {
                case '[':
                case '{':
                case '(':
                    stack.push(curr);
                    break;
                case ']':
                    if (stack.empty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.empty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ')':
                    if (stack.empty() || stack.pop() != '(') {
                        return false;
                    }
                    break;

            }

        }


        if (stack.empty()) {
            return true;
        }

        return false;

    }
}
