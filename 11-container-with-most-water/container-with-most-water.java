class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = Integer.MIN_VALUE;
        int ans = max;

        while(i < j) {
            if(height[i] > height[j]) {
                max = height[j] * (j - i);
                j--;
            } else {
                max = height[i] * (j - i);
                i++;
            }
            ans = ans > max? ans: max;
        }

        return ans;
    }
}