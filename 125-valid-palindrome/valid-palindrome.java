class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String s1 = "";
        String s2 = "";
        int n = s.length();

        for(int i = 0; i < n; i++) {
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                s1 += s.charAt(i);
            }
        }

        s2 = new StringBuilder(s1).reverse().toString();

        return s1.equals(s2) ? true : false;
    }
}