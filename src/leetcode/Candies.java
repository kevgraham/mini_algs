package leetcode;

import java.util.HashSet;

public class Candies {

    public static void main(String[] args) {
        int[] test1 = {1, 1, 2, 2, 3, 3};
        System.out.println(distributeCandies(test1)); // 3

        int[] test2 = {1, 1, 2, 3};
        System.out.println(distributeCandies(test2)); // 2
    }

    public static int distributeCandies(int[] candies) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : candies) {
            if (!seen.contains(num)) {
                seen.add(num);
            }
        }

        return (Math.min(seen.size(), candies.length / 2));

    }
}
