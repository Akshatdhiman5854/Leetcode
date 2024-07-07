class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        int lb = numBottles;

        while(lb >= numExchange) {
            int x = lb / numExchange;
            int ex;
            if(lb % numExchange == 0) {
                lb = x;
                ans += lb;
            }
            else {
                lb = lb - (x * numExchange) + x;
                ans += x;
            }
        }

        return ans;
    }
}