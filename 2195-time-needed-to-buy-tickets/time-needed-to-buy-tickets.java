class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        
        int ans = 0;
        for(int i=0; i<tickets.length; i++) {
            if(i <= k) {
                ans += tickets[i] < tickets[k]? tickets[i]: tickets[k];
            }
            else {
                ans += tickets[i] < tickets[k] - 1? tickets[i]: tickets[k] - 1;
            }
        }

        return ans;
    }
}