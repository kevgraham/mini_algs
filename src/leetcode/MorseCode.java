package leetcode;

import java.util.HashSet;

public class MorseCode {

    public static void main(String[] args) {
        String[] test1 = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(test1));
    }

    public static int uniqueMorseRepresentations(String[] words) {

        HashSet<String> transforms = new HashSet<>();

        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
                ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                "...","-","..-","...-",".--","-..-","-.--","--.."};

        for (String word : words) {
            String transform = "";

            // transform word
            for (int i = 0; i < word.length(); i++) {
                int letter = word.charAt(i) - 97;
                transform += morse[letter];

            }

            transforms.add(transform);
        }

        return transforms.size();
    }
}
