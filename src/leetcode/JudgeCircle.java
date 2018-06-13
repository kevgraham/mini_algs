package leetcode;

public class JudgeCircle {

    public static void main(String[] args) {
        System.out.println(judgeCircle("LR"));    // true
        System.out.println(judgeCircle("LRUD"));  // true
        System.out.println(judgeCircle("LL"));    // false
        System.out.println(judgeCircle("UUD"));   // false
    }

    public static boolean judgeCircle(String moves) {

        moves = moves.toUpperCase();

        int x = 0;
        int y = 0;

        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'U':
                    y -= 1;
                    break;
                case 'D':
                    y += 1;
                    break;
                case 'L':
                    x -= 1;
                    break;
                case 'R':
                    x += 1;
            }
        }

        return x == 0 && y == 0;

    }
}
