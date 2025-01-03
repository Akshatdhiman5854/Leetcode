class Solution {
    public String largestOddNumber(String num) {
        if((num.charAt(num.length() - 1) - '0') % 2 != 0) {
            return num;
        }

        long ans = 0;
        int n = num.length();
        for(int i = n - 1; i >= 0; i--) {
            if((num.charAt(i) - '0') % 2 != 0) {
                // long x = Long.parseLong(num.substring(0, i+1));
                // if(x > ans) { 
                //     ans = x;
                // }
                return num.substring(0, i + 1);
            }
        }

        if(ans == 0) {
            return "";
        }
        return Long.toString(ans);
    }
}