package ctci;

public class LinkedListDigits {

    public static void main(String[] args) {
        // 617
        ListNode num1 = new ListNode(7);
        num1.next = new ListNode(1);
        num1.next.next = new ListNode(6);
        System.out.println(readNum(num1));      // 617

        // 295
        ListNode num2 = new ListNode(5);
        num2.next = new ListNode(9);
        num2.next.next = new ListNode(2);
        System.out.println(readNum(num2));      // 295

        ListNode result1 = sumList(num1, num2); // 2 -> 1 -> 9
        System.out.println(readNum(result1));   // 912

        ListNode result2 = sumList(num1, null); // 7 -> 1 -> 6
        System.out.println(readNum(result2));   // 617

    }

    public static ListNode sumList(ListNode list1, ListNode list2) {
        return writeNum(readNum(list1) + readNum(list2));
    }

    public static ListNode writeNum(int num) {
        ListNode result = null;
        ListNode iter = null;
        int n = num;
        int digit = 0;

        while (n > 0) {
            digit = n % 10;

            if (result == null) {
                result = new ListNode(digit);
                iter = result;
            } else {
                iter.next = new ListNode(digit);
                iter = iter.next;
            }

            n /= 10;
        }

        return result;
    }

    public static int readNum(ListNode num) {
        int result = 0;
        int digit = 0;

        ListNode iter = num;

        while (iter != null) {
            int mult = (digit > 0) ? ((int)Math.pow(10, digit)) : 1;
            result = (iter.val * mult) + result;
            digit++;
            iter = iter.next;
        }

        return result;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
