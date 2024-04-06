class Solution {
    public String minRemoveToMakeValid(String s) {
        if(s.length() == 0) {
            return "";
        }
        if(s.length() == 1 && (s.charAt(0) == '(' || s.charAt(0) == ')')) {
            return "";
        }

        Stack<Character> st = new Stack<>();
        int op = 0;
        int cl = 0;
        String ss = "";

        for(char ch: s.toCharArray()) {
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
            char ch = st.pop();

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