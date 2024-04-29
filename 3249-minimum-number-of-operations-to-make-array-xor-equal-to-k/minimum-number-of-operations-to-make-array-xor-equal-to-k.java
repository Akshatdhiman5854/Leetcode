class Solution {
    public int minOperations(int[] nums, int k) {
        int count = k;
        int ans = 0;

        for(int x: nums) {
            count ^= x;
        }

        while(count != 0) {
            ans += count & 1;
            count >>= 1;
        }

        return ans;
    }
}