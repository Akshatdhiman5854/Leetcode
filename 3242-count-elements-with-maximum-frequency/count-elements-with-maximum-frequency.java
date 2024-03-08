class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        // for(int i=0; i<nums.length; i++) {
        // if(mp.containsKey(nums[i])) {
        // int a = mp.get(nums[i]);
        // mp.replace(nums[i], a+1);
        // }
        // else {
        // mp.put(nums[i], 1);
        // }
        // }
        for (int x : nums) {
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        }
        int max = 0;
        for (int value : mp.values()) {
            max = max > value ? max : value;
        }
        int ans = 0;
        // for (Map.Entry<Integer, Integer> set : mp.entrySet()) {
        // if(set.getValue() == max) {
        // ans += max;
        // }
        // }

        for (int value : mp.values()) {
            if (value == max)
                ans += value;
        }

        return ans;
    }
}