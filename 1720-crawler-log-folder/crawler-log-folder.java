class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st = new Stack<>();

        for(String s : logs) {
            if(s.equals("./")) {
                continue;
            } else if(!st.isEmpty() && s.equals("../")) {
                st.pop();
            } else {
                if(!s.equals("../")) {
                    st.push(s);
                }
            }
        }

        return st.size();
    }
}