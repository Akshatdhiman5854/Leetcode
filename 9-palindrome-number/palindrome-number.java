class Solution {
    public boolean isPalindrome(int x) {
        String s1 = Integer.toString(x);
        // StringBuilder ss = 
        // ss.reverse();
        String s2 = new StringBuilder(s1).reverse().toString();

        return s1.equals(s2) ? true : false;
    }
}