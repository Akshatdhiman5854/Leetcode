class Solution {
    public int maxDepth(String s) {
        if(s.length() == 0 || s.length() == 1) {
            return 0;
        }

        int ans = 0;
        int dep = 0;
        int n = s.length();

        for(char ch: s.toCharArray()) {
            if( ch == '(') {
                dep++;
            }

            ans = ans > dep? ans: dep;

            if(ch == ')') {
                dep--;
            }
        }
        return ans;
    }
}



// Stack<Character> st = new Stack<>();
// for(int i=0; i<n; i++) {
//     if(s.charAt(i) == '(') {
//         st.push('(');
//     }
//     else if(s.charAt(i) == ')') {
//         ans = ans > st.size()? ans: st.size();
//         st.pop();
//     }
// }