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

    public int gcd(int x, int y) {
        //Euclidean algorithm

        if(x == 1 || y == 1) {
            return 1;
        }

        if(x == y) {
            return x;
        }

        if(x > y) {
            return gcd((x - y), y);
        }

        return gcd(x, (y - x));
    }

    // public int gcd(int x, int y) {
    //     int ans = x < y? x : y;
    //     while(ans > 0) {
    //         if(x % ans == 0 && y % ans == 0) {
    //             break;
    //         }
    //         ans--;
    //     }
    //     return ans;
    // }


    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null) {
            return head;
        }

        ListNode p = head;
        ListNode q = head.next;

        while(q != null) {
            ListNode temp = new ListNode(gcd(p.val, q.val));
            temp.next = p.next;
            p.next = temp;
            p = p.next.next;
            q = q.next;
        }

        return head;
    }
}