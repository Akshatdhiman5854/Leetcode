class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int op = 0;
        int cl = 0;
        String ss = "";
        char ch;
        for(int i = 0; i<s.length(); i++) {
            ch = s.charAt(i);
            if(ch == '(') {
                op++;
            }
            else if(ch == ')') {
                cl++;
            }

            if(cl > op) {
                cl--;
                continue;
            }
            else {
                st.push(ch);
            }
        }

        while(!st.isEmpty()) {
            ch = st.pop();

            if(op > cl && ch == '(') {
                op--;
            }
            else {
                ss = ch + ss;
            }
        }

        return ss;
    }
}