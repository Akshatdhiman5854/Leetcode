class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set <Integer> res = new HashSet<>();
        for (int i = 0;i<nums.length;i++) {
            
            if (res.contains(nums[i])) {
                return true;
            }
            
            res.add(nums[i]);
        }
        return false;
    }
}