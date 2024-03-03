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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) {
            return null;
        }
        if(head.next == null && n ==1) {
            return null;
        }
        
        ListNode p = head;
        int l = 0;
        while(p!=null) {
            p = p.next;
            l++;
        }
        if(l == n) {
            head = head.next;
            return head;
        }
        int i=0;
        ListNode a = head;
        while(i<(l-n-1)) {
            a=a.next;
            i++;
        }
        a.next = a.next.next;


        return head;
    }
}