class Solution {
    public boolean isPalindrome(int x) {
        String s1 = Integer.toString(x);
        StringBuilder ss = new StringBuilder(s1);
        ss.reverse();
        String s2 = ss.toString();

        return s1.equals(s2) ? true : false;
    }
}