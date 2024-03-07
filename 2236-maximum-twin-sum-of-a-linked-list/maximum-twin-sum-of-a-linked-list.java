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
    public int pairSum(ListNode head) {
        int l = 0;
        ListNode p = head;

        while(p != null) {
            l++;
            p = p.next;
        }
        p = head;
        if(l == 2) {
            int sum = p.val + p.next.val;
            return sum;
        }
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i <= (l/2)-1; i++) {
            st.push(p.val);
            p = p.next;
        }

        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = (l/2); i < l; i++) {
            sum = st.peek() + p.val;
            st.pop();
            p = p.next;
            max = max>sum? max: sum;
        }

        return max;
    }
}