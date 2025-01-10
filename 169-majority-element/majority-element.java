class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();

        int m = nums.length / 2;
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            if(!mp.containsKey(nums[i])) {
                mp.put(nums[i], 1);
            } else {
                mp.put(nums[i], mp.get(nums[i]) + 1);
            }

            if(mp.get(nums[i]) > m) {
                ans = nums[i];
                break;
            }
        }
        return ans;
    }
}