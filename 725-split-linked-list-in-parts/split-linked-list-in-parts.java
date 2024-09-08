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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode itr = head;
        int n = 0;
        while(itr != null){
            n++;
            itr = itr.next;
        }
        int x = (n/k);
        int y = (n%k);
        ListNode[] arr = new ListNode[k];
        int a = 0,i=0;
        if(y != 0){
            a = 1;
        }
        itr = head;
        for(i=0;i<k;i++){
            ListNode it = itr;
            arr[i]=it;
            int b = (x+a)-1;
            while(b>0){
                it = it.next;
                b--;
            }
            y--;
            if(y==0){
                a=0;
            }
            if(it == null){
                break;
            }
            itr = it.next;
            it.next = null;
        }
        while(i<k){
            arr[i]=null;
            i++;
        }
        return arr;
    }
}