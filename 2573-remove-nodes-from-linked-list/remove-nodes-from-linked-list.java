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
    int max = Integer.MIN_VALUE;
    public ListNode removeNodes(ListNode head) {
        if(head == null) return null;

        head.next = removeNodes(head.next);

        max = max > head.val? max: head.val;

        if(max > head.val) {
            return head.next;
        }

        return head;

        // if (head == null) return null;
        // head.next = removeNodes(head.next);
        // return head.next != null && head.val < head.next.val ? head.next : head;
    }

}