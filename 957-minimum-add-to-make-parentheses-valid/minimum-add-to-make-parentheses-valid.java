class Solution {
    public int minAddToMakeValid(String s) {
        int ans = 0;
        int op = 0;
        int cl = 0;
        for(Character ch : s.toCharArray()) {
            if(ch == '(') 
                op++;
            else if(ch == ')' && op > 0)
                op--;
            else 
                cl++;
        }

        return op + cl;
    }
}