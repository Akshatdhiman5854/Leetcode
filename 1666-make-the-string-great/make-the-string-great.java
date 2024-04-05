class Solution {
    public String makeGood(String s) {
        if(s.length() < 2) {
            return s;
        }

        String ss = "";
        Stack<Character> st = new Stack<>();

        
        st.push(s.charAt(0));
        for(int i=1; i<s.length(); i++) {
            if(!st.isEmpty() && ((st.peek() == s.charAt(i)+32) || (st.peek() == s.charAt(i)-32))) {
                st.pop();
            }
            else {
                st.push(s.charAt(i));
            }
        }

        while(!st.isEmpty()) {
            ss = st.pop() + ss;
        }

        return ss;
    }
}