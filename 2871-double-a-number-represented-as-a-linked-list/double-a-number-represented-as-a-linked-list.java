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
    public ListNode doubleIt(ListNode head) {
        if(head.val > 4) {
            head = new ListNode(0, head);
        }
        ListNode p = head;

        while(p != null) {
            p.val = (p.val * 2) % 10;

            if(p.next != null && p.next.val > 4) {
                p.val++;
            }

            p = p.next;
        }

        return head;
    }
}