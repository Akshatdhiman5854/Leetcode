class Solution {
    public int maximumGain(String s, int x, int y) {
        int max = (x > y) ? x : y;
        int min = (x > y) ? y : x;
        
        int score = 0;
        String prio1 = (max == x) ? "ab" : "ba";
        String prio2 = prio1.equals("ab") ? "ba" : "ab";
        int n = s.length();

        String ss = removesub(s, prio1);        
        score += max * ((n - ss.length())/2);
        n = ss.length();

        String sss = removesub(ss, prio2);
        score += min * ((n - sss.length())/2);

        return score;
    }

    public String removesub(String s, String y) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        char ch[] = y.toCharArray();
        if(n == 0) {
            return "";
        }

        st.push(s.charAt(0));
        for(int i = 1; i < n; i++) {
            char c = s.charAt(i);

            if(c == ch[1] && !st.isEmpty() && st.peek() == ch[0]) {
                st.pop();
                continue;
            }
            st.push(s.charAt(i));
        }

        StringBuilder ss = new StringBuilder();

        while(!st.isEmpty()) {
            ss.append(st.pop());
        }

        return ss.reverse().toString();
    }
}









/*
        if(s.length() <= 1) {
            return 0;
        }
        Stack<Character> st = new Stack<>();

        int n = s.length();
        int xscore = 0;
        int yscore = 0;

        st.push(s.charAt(0));
        if(x > y) {
            for(int i = 1; i < n; i++) {
                char ch = s.charAt(i);
                if(ch == 'b' && !st.isEmpty() && st.peek() == 'a') {
                    st.pop();
                    xscore += x;
                    continue;
                }
                st.push(s.charAt(i));
            }
            String ss = "";
            while(!st.isEmpty()) {
                ss += st.pop();
            }

            st.push(ss.charAt(0));
            n = ss.length();
            for(int i = 1; i < n; i++) {
                char ch = ss.charAt(i);
                if(ch == 'b' && !st.isEmpty() && st.peek() == 'a') {
                    st.pop();
                    yscore += y;
                    continue;
                }
                st.push(ss.charAt(i));
            }
        } 
        else {
            for(int i = 1; i < n; i++) {
                char ch = s.charAt(i);
                if(ch == 'a' && !st.isEmpty() && st.peek() == 'b') {
                    st.pop();
                    yscore += y;
                    continue;
                }
                st.push(s.charAt(i));
            }

            String ss = "";
            while(!st.isEmpty()) {
                ss += st.pop();
            }

            st.push(ss.charAt(0));
            n = ss.length();
            
            for(int i = 1; i < n; i++) {
                char ch = ss.charAt(i);
                if(ch == 'a' && !st.isEmpty() && st.peek() == 'b') {
                    st.pop();
                    xscore += x;
                    continue;
                }
                st.push(ss.charAt(i));
            }

        }

        System.out.println(xscore + yscore);

        return (xscore + yscore);
*/