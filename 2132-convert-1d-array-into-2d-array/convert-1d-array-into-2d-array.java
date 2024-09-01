class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length != (m * n)) {
            int[][] arr = {};
            return arr;
        }
        int arr[][] = new int[m][n];
        int i = 0;
        int j = 0;
        int size = original.length;
        int row = 0;
        for(int k = 0; k < size; k++) {
            if(j == n) {
                j = 0;
                i++;
            }

            if(i < m && j < n) {
                arr[i][j] = original[k];
                j++;
            }
        }

        return arr;
    }
}