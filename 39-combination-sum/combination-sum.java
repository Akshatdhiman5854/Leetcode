class Solution {

    List<List<Integer>> ans;
    int target;

    public void backtrack(List<Integer> list, int[] candidates, int sum, int indx) {
        if(sum > this.target) {
            return;
        } else if(sum == target) {
            ans.add(new ArrayList<>(list));
            return;
        }

        int n = candidates.length;

        for(int i = indx; i < n; i++) {
            list.add(candidates[i]);
            backtrack(list, candidates, sum + candidates[i], i);
            list.remove(list.size() - 1);
        }

    }


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        this.target = target;

        backtrack(list, candidates, 0, 0);

        return ans;
    }
}