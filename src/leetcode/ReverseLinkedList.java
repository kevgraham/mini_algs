package leetcode;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = null;

        head = reverseList(head);
        head = reverseList(null);
    }

    public static ListNode reverseList(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode prev = head;
        ListNode curr = null;
        ListNode lead = null;

        // init pointers
        if (head.next == null) {
            return head;
        } else {
            curr = head.next;

            if (curr.next == null) {
                curr.next = prev;
                prev.next = null;
                return curr;
            } else {
                lead = curr.next;
            }
        }

        // get rid of first point
        prev.next = null;

        while (lead != null) {
            curr.next = prev;
            prev = curr;
            curr = lead;
            lead = (lead.next != null) ? lead.next : null;
        }

        curr.next = prev;
        return curr;

    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
