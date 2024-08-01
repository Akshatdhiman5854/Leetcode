class Solution {
    public int countSeniors(String[] details) {
        if(details.length == 0) {
            return 0;
        }

        int n = details.length;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            String s = details[i];
            String ss = "";
            ss += s.charAt(11);
            ss += s.charAt(12);
            System.out.println(s);
            System.out.println(ss);
            if(Integer.parseInt(ss) > 60) {
                ans++;
            }
        }

        return ans;
    }
}