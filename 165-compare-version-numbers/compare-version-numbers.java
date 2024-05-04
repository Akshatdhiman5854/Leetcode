class Solution {
    public int compareVersion(String v1, String v2) {
        int i = 0;
        int j = 0;

        while(i < v1.length() || j < v2.length()) {

            int num1 = 0;
            int num2 = 0;
            while (i < v1.length() && v1.charAt(i) != '.') {
                num1 = num1 * 10 + (v1.charAt(i++) - '0');
            }
            while (j < v2.length() && v2.charAt(j) != '.') {
                num2 = num2 * 10 + (v2.charAt(j++) - '0');
            }

            if(num1 < num2) {
                return -1;
            }
            if(num1 > num2) {
                return 1;
            }
            i++;
            j++;
        }

        return 0;
    }
}