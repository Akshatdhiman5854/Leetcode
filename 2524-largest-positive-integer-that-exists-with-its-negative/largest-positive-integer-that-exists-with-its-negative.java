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


        // HashMap<Integer, Integer> mp = new HashMap<>();
        // int max = Integer.MIN_VALUE;
        // for(int i = 0; i< nums.length; i++) {
        //     if(mp.containsKey(-1*nums[i])) {
        //         max = nums[i] > max? nums[i] : max;
        //         max = (-1*nums[i]) > max? (-1*nums[i]) : max;
        //         mp.put(nums[i], mp.getOrDefault(nums[i], 1));
        //     } else {
        //         mp.put(nums[i], 1);
        //     }
        // }

        // if(max == Integer.MIN_VALUE) {
        //     return -1;
        // }
        // return max;
    }
}