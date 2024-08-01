class Solution {
    public int countSeniors(String[] details) {
        if(details.length == 0) {
            return 0;
        }

        int n = details.length;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            String s = details[i].substring(11, 13);
            if(Integer.parseInt(s) > 60) {
                ans++;
            }
        }

        return ans;
    }
}