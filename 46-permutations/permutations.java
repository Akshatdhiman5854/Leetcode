class Solution {
    List<List<Integer>> ans;

    public List<List<Integer>> permute(int[] nums) {
        ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        backtrack(list, nums);
        return ans;    
    }

    public void backtrack(List<Integer> list, int[] nums) {
        if(list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if(list.contains(nums[i])) {
                continue;
            }
            list.add(nums[i]);
            backtrack(list, nums);
            list.remove(list.size() - 1);
        }
    }
}