class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        

        for(int i = 0; i < m; i++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int indx = -1;

            for(int j = 0; j < n; j++) {
                if(matrix[i][j] < min) {
                    min = matrix[i][j];
                    indx = j;
                }
            }

            for(int k = 0; k < m; k++) {
                if(matrix[k][indx] > max) {
                    max = matrix[k][indx];
                }
            }
            
            if(min == max) {
                ans.add(min);
            }


        }
        return ans;
    }
}