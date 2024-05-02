class Solution {
    public int findMaxK(int[] nums) {
        if(nums.length == 1) {
            return -1;
        }
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0;
        int j = n-1;
        
        while(i < j) {
            if((-1*nums[i]) == nums[j]) {
                return nums[j];
            } else if((-1*nums[i]) > nums[j]) {
                i++;
            } else {
                j--;
            }
        }

        return -1;
    }
}