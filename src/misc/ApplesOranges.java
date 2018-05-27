package misc;

public class ApplesOranges {


    public static void main(String[] args) {

        int[] apples = {-2, 2, 1};
        int[] oranges = {5, -6};

        countApplesAndOranges(7, 11, 5, 15, apples, oranges);

    }


    /**
     * Prints the number of apples and oranges that fell on the house
     * @param s house left
     * @param t house right
     * @param a apple tree
     * @param b orange tree
     * @param apples distance apples fell from point a
     * @param oranges distance oranges fell from point b
     */
    public static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        int appleCount = 0, orangeCount = 0;
        int pos;

        for (int i = 0; i < apples.length; i++) {
            pos = a + apples[i];

            if (pos >= s && pos <= t) {
                appleCount++;
            }
        }

        for (int i = 0; i < oranges.length; i++) {
            pos = b + oranges[i];

            if (pos >= s && pos <= t) {
                orangeCount++;
            }
        }

        System.out.println(appleCount);
        System.out.println(orangeCount);

    }
}
