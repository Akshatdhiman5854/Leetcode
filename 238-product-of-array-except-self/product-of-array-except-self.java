class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length <= 1) {
            return nums;
        }
        int n = nums.length;
        int []arr = new int[n];
        int sp = 1;

        arr[0] = 1;

        for(int i = 1; i < n; i++) {
            arr[i] = arr[i-1] * nums[i-1];
        }

        for(int i = n-1; i >= 0; i--) {
            arr[i] *= sp;
            sp *= nums[i];
        }
        return arr;
    }
}