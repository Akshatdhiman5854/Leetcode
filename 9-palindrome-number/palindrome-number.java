class Solution {
    public boolean isPalindrome(int x) {
        // String s1 = Integer.toString(x);
        // // StringBuilder ss = new StringBuilder(s1);
        // // ss.reverse();
        // String s2 = new StringBuilder(s1).reverse().toString();

        // return s1.equals(s2) ? true : false;

        int rev = 0;
        int temp = x;
        while(x > 0) {
            rev = (rev * 10) + (x % 10);
            x = x / 10;
        }

        return rev == temp;
    }
}