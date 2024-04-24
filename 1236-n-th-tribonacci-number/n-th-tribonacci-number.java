class Solution {
    public int tribonacci(int n) {
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else if(n == 2) {
            return 1;
        }
        int t0 = 0;
        int t1 = 1;
        int t2 = 1;
        int x = 0;
        for(int i=0; i<n-2; i++) {
            x = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = x;
        }
        return x;
    }
}