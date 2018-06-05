package hackerrank;

import java.util.HashMap;

public class MigratingBirds {

    public static void main(String[] args) {

        int[] test1 = {1, 4, 4, 4, 5, 3};
        System.out.println(migratoryBirds(test1)); // 4

        int[] test2 = {1, 5, 5, 4, 4, 3};
        System.out.println(migratoryBirds(test2)); // 4


    }

    static int migratoryBirds(int[] ar) {
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < ar.length; i++) {
            // pull stashed count for id
            Integer count = countMap.get(ar[i]);

            // increment count
            count = (count == null) ? 1 : count + 1;

            // update count stash
            countMap.put(ar[i], count);
        }


        int max;
        int maxId = ar[0];

        // find max
        for (int i = 0; i < ar.length; i++) {
            max = countMap.get(maxId);


            if (countMap.get(ar[i]) > max) {
                maxId = ar[i];
            }
            else if (countMap.get(ar[i]) == max) {
                maxId = Math.min(maxId, ar[i]);
            }
        }

        return maxId;
    }
}
