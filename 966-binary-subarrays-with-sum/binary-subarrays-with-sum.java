class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        if(nums.length == 1 && nums[0] != goal) {
            return 0;
        }

        int ans = 0;
        int n = nums.length;
        int sum = 0;
        for(int i=0; i<n; i++) {
            int j = i;
            while(j < n) {
                sum += nums[j];
                if(sum == goal) {
                    ans++;
                }
                else if(sum > goal) {
                    break;
                }
                j++;
            }
            sum = 0;
        }

        return ans;
    }
}