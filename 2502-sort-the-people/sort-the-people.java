class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> mp = new HashMap<>();

        int n = heights.length;

        String ans[] = new String[n];

        for(int i = 0; i < n; i ++) {
            mp.put(heights[i], names[i]);
        }

        Arrays.sort(heights);
        int k = 0;
        for(int i = n-1; i >= 0; i--) {
            ans[k] = mp.get(heights[i]);
            k++; 
        }

        return ans;
    } 
}