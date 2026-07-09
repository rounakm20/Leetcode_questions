/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode reverse(ListNode head, int k) {
        ListNode prev = null;
        ListNode curr = head;

        while (k-- > 0 && curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int size) {

        if (head == null) {
            return head;
        }

        ListNode left = head;
        ListNode res = null;
        ListNode prevLeft = null;
        ListNode right;

        while (true) {

            right = left;

            for (int i = 0; i < size - 1; i++) {
                if (right == null) {
                    break;
                }
                right = right.next;
            }

            if (right != null) {

                ListNode nextLeft = right.next;

                right = reverse(left, size);

                if (prevLeft != null) {
                    prevLeft.next = right;
                }

                left.next = nextLeft;

                if (res == null) {
                    res = right;
                }

                prevLeft = left;
                left = nextLeft;

                if (left == null) {
                    break;
                }

            } else {

                if (prevLeft != null) {
                    prevLeft.next = left;
                }

                if (res == null) {
                    res = left;
                }

                break;
            }
        }

        return res;
    }
}
