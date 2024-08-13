class Solution {
    List<List<Integer>> ans;
    int target;

    public void backtrack(List<Integer> list, int[] candidates, int sum, int indx) {
        if(sum > this.target) {
            return;
        } else if(sum == this.target) {
            if(!ans.contains(list)) {
                ans.add(new ArrayList<>(list));
            }
            return;
        }

        for(int i = indx; i < candidates.length; i++) {
            if(i > indx && candidates[i] == candidates[i - 1]) {
                continue;
            }
            list.add(candidates[i]);
            backtrack(list, candidates, sum + candidates[i], i + 1);
            list.remove(list.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        this.target = target;
        Arrays.sort(candidates);

        backtrack(list, candidates, 0, 0);
        return ans;
    }
}