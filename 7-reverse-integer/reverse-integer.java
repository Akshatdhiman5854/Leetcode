class Solution {
    public int reverse(int x) {
        int n = Math.abs(x);
        int ans = 0;
        while( n > 0 ) {
            int temp = n % 10;
            
            if(ans > (Integer.MAX_VALUE - temp) / 10) {
                return 0;
            }

            ans = ans*10 + temp;
            n = n / 10;
        }

        return (x < 0) ? (-ans) : ans;
    }
}