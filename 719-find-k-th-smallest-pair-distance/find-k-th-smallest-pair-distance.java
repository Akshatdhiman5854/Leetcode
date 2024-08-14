class Solution {

    private int helper(int[] nums, int mid, int n) {
        int total = 0;
        for (int right = 0, left = 0; right < n; right++) {
            while (nums[right] - nums[left] > mid) {
                left++;
            }
            total += (right - left);
        }
        return total;
    }


    public int smallestDistancePair(int[] nums, int k) {

        int n = nums.length;

        Arrays.sort(nums);

        int left = 0, right = nums[n - 1] - nums[0];
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (helper(nums, mid, n) >= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return right;








    //     List<Integer> list = new ArrayList<>();
    //     // backtrack(l, 0);
    //     int n = nums.length;
    //     for(int i = 0; i < n-1; i++) {
    //         for(int j = i + 1; j < n; j++) {
    //             list.add(Math.abs(nums[i] - nums[j]));
    //         }
    //     }

    //     Collections.sort(list);
    //     return list.get(k - 1);
    }

    // public void backtrack(List<Integer> l, int indx) {
    //     if(l.size() == 2) {
    //         list.add(Math.abs(l.get(0) - l.get(1)));
    //         return;
    //     }

    //     for(int i = indx; i < arr.length; i++) {
    //         l.add(arr[i]);
    //         backtrack(l, i + 1);
    //         l.removeLast();
    //     }
    // }
}