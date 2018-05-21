package hackerrank;

public class TimeConversion {

    public static void main(String[] args) {
        System.out.println(timeConversion("12:05:45PM"));
    }

    static String timeConversion(String s) {
        /*
         * Write your code here.
         */

        int hour = Integer.parseInt(s.substring(0, 2));
        boolean pm = s.indexOf("PM") > 0;

        if (pm && hour > 12) {
            hour += 12;
        } else if (!pm && hour == 12) {
            hour = 0;
        }

        String front = String.format("%02d", hour);
        String back = s.substring(2, s.length() - 2);
        return front + back;
    }
}
