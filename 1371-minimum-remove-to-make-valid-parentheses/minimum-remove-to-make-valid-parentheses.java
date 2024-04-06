class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int op = 0;
        int cl = 0;
        String ss = "";
        char ch;
        int n = s.length();
        for(int i = 0; i<n; i++) {
            ch = s.charAt(i);
            if(ch == '(')
                op++;
            else if(ch == ')') 
                cl++;

            if(cl > op) {
                cl--;
                continue;
            }
            else 
                st.push(ch);
        }
        n = st.size();
        while(n != 0) {
            ch = st.pop();
            n--;

            if(op > cl && ch == '(') 
                op--;
            else 
                ss = ch + ss;
        }

        return ss;
    }
}