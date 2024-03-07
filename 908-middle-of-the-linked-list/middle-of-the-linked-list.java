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
    public ListNode middleNode(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode p = head;
        int l = 0;
        int pos;
        while(p != null) {
            p = p.next;
            l++;
        }
        p = head;
        int i = 0;
        while(i < l/2) {
            i++;
            p = p.next;
        }

        return p;
    }
}