class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];

        if(n == 1) {
            return new int[]{nums[0]*nums[0]};
        }
        int i = 0;
        int j = n - 1;
        int k = n - 1;
        int a = nums[i] * nums[i];
        int b = nums[j] * nums[j];

        while(i <= j) {
            a = nums[i] * nums[i];
            b = nums[j] * nums[j];
            if(a > b) {
                ans[k] = a;
                i++;
            } else {
                ans[k] = b;
                j--;
            }
            k--;
        }

        return ans;
        
    }
}