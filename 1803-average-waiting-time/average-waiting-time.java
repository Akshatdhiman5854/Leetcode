class Solution {
    public double averageWaitingTime(int[][] customers) {
        int wait[] = new int[customers.length];

        int ti = customers[0][0];
        int n = customers.length;

        for(int i = 0; i < n; i++) {
            if(ti < customers[i][0]) {
                ti = customers[i][0];
            }
            ti = ti + customers[i][1];
            wait[i] = ti - customers[i][0];
        }

        double ans = 0;
        for(int i = 0; i < n; i++) {
            ans += wait[i];
            System.out.print(wait[i]+" ");
        }

        ans = ans / n;

        return ans;


    }
}