class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();

        int mindiff = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i = 1; i<arr.length; i++) {
            mindiff = Math.min(mindiff, Math.abs(arr[i]-arr[i-1]));
        }

        for(int i=1; i<arr.length; i++) {
            if(Math.abs(arr[i]-arr[i-1]) == mindiff) {
                // List<Integer> t = new ArrayList<>();
                // t.add(arr[i-1]);
                // t.add(arr[i]);
                // ans.add(t);
                ans.add(Arrays.asList(new Integer[]{arr[i-1],arr[i]}));
            }
        }
        return ans;
    }
}