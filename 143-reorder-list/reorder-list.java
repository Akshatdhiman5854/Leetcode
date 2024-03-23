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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) {
            return;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode newhead = Listreverse(slow.next);
        slow.next = null;

        ListNode p = head;
        ListNode q = newhead;

        while(p != null && q != null) {
            ListNode temp = p.next;

            p.next = q;

            ListNode temp2 = q.next;

            q.next = temp;

            p = temp;
            q = temp2;
        }
    }

    
    public ListNode Listreverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null) {
            ListNode nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        head = prev;

        return head;
    }
}