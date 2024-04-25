class Solution {

    public int longestIdealString(String s, int k) {
        int[] dp = new int[27];
        int n = s.length();
        for (int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int idx = c - 'a';
            int max = Integer.MIN_VALUE;
            int left = (idx - k) > 0? (idx - k): 0;//Math.max((idx - k), 0);
            int right = (idx + k) < 26? (idx + k): 26;//Math.min((idx + k), 26);
            for (int j = left; j <= right; j++) {
                // max = Math.max(max, dp[j]);
                max = max > dp[j]? max: dp[j];
            }
            dp[idx] = max + 1;
        }
        int max = Integer.MIN_VALUE;
        for (int ele : dp) {
            // max = Math.max(ele, max);
            max = ele > max? ele: max;
        }
        return max;
    }
}