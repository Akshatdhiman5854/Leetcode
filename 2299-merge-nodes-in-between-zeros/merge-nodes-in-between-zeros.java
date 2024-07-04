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
    public ListNode mergeNodes(ListNode head) {
        ListNode newhead = new ListNode(-1);
        newhead.next = head;
        ListNode q = newhead;
        ListNode p = head.next;
        ListNode prev = q;
        int n = 0;
        int i = 0;
        while(p != null) {
            if(p.val == 0) {
                q.next.val = n;
                n = 0;
                p = p.next;
                q = q.next;
            }
            else {
                n = n + p.val;
                p = p.next;
            }
        }
        q.next = null;

        return head;
    }
}