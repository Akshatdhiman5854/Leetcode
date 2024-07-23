class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        Integer ans[] = new Integer[n];
        int i = 0;
        
        for(int x : nums) {
            mp.put(x, mp.getOrDefault(x, 0) + 1);
            ans[i] = x;
            i++;
        }
        
        Arrays.sort(ans, (n1, n2) -> {
            if(mp.get(n1) != mp.get(n2)) {
                return mp.get(n1) - mp.get(n2);
            } else {
                return n2 - n1;
            }
        });

        i = 0;
        for(int x : ans) {
            nums[i] = x;
            i++;
        }

        return nums;

    }
}