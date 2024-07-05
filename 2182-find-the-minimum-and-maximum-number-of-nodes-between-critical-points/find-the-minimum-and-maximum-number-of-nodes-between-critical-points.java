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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = {-1, -1};

        List<Integer> list = new ArrayList<>();

        int l = 0;

        ListNode prev = head;
        ListNode curr = head.next;
        ListNode nex = head.next.next;

        while(nex != null) {
            l++;

            if(curr.val < prev.val && curr.val < nex.val) {
                list.add(l+1);
            }
            else if(curr.val > prev.val && curr.val > nex.val) {
                list.add(l+1);
            }

            prev = prev.next;
            curr = curr.next;
            nex = nex.next;
        }
        
        if(list.size() < 2) {
            return ans;
        } 
        else if(list.size() == 2) {
            ans[0] = ans[1] = Math.abs(list.get(0) - list.get(1));
        }
        System.out.println(list);

        // int max = Collections.max(list);
        // int min = Collections.min(list);

        // list.remove(Integer.valueOf(max));
        // smax = Collections.max(list);
        Collections.sort(list);
        int max = list.get(list.size() - 1);
        int min = list.get(0);

        int dif = Integer.MAX_VALUE;
        for(int i = 1; i < list.size(); i++) {
            int x = list.get(i) - list.get(i - 1);
            if( x < dif) {
                dif = x;
            }
        }


        ans[0] = dif;
        ans[1] = max - min;
        return ans;
    }
}