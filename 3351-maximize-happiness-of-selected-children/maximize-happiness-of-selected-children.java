class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n = happiness.length;
        int c = 0;
        long ans = 0;
        for(int i = n-1; i >= n-k; i--) {
            if((happiness[i] - c) >= 0) {
                ans += happiness[i] - c;
                c++;
            }
        }

        return ans;
    }
}