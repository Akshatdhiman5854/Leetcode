class Solution {
    public double averageWaitingTime(int[][] customers) {
        int wait[] = new int[customers.length];

        int ti = customers[0][0];
        int n = customers.length;
        double ans = 0;

        for(int i = 0; i < n; i++) {
            if(ti < customers[i][0]) {
                ti = customers[i][0];
            }
            ti = ti + customers[i][1];
            ans = ans + ti - customers[i][0];
        }

        ans = ans / n;

        return ans;
    }
}