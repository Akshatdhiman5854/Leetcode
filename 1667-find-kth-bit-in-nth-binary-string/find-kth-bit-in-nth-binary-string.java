class Solution {
    private String[] v;

    private String solve(int ind) {
        if (ind == 0) {
            return "0";
        }

        String tmp = solve(ind - 1);
        v[ind] = tmp + "1" + rev(invert(tmp));
        return v[ind];
    }

    private String invert(String s) {
        StringBuilder tmp = new StringBuilder(s);
        for (int i = 0; i < tmp.length(); i++) {
            if (tmp.charAt(i) == '1') {
                tmp.setCharAt(i, '0');
            } else {
                tmp.setCharAt(i, '1');
            }
        }
        return tmp.toString();
    }

    private String rev(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public char findKthBit(int n, int k) {
        v = new String[n];
        v[0] = "0";
        solve(n - 1);
        return v[n - 1].charAt(k - 1);
    }
}