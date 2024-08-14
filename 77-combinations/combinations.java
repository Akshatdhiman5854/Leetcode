class Solution {
    List<List<Integer>> ans;
    int k;
    public List<List<Integer>> combine(int n, int k) {
        ans = new ArrayList<>();
        this.k = k;
        List<Integer> list = new ArrayList<>();

        backtrack(list, n, 1);
        
        return ans;
    }

    public void backtrack(List<Integer> list, int n, int indx) {
        if(list.size() == k) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i = indx; i <= n; i++) {
            if(list.contains(i)) {
                continue;
            }
            list.add(i);
            backtrack(list, n, i + 1);
            list.removeLast();
        }
    }
}