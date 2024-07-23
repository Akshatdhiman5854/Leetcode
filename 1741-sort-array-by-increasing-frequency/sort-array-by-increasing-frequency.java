class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        Integer ans[] = new Integer[n];
        
        for(int i = 0; i < n; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
            ans[i] = nums[i];
        }
        
        Arrays.sort(ans, (n1, n2) -> {
            if(mp.get(n1) != mp.get(n2)) {
                return mp.get(n1) - mp.get(n2);
            } else {
                return n2 - n1;
            }
        });

        for(int i = 0; i < n; i++) {
            nums[i] = ans[i];
        }

        return nums;

    }
}