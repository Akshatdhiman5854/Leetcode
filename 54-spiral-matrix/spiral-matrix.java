class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        List<Integer> ans = new ArrayList<>();
        if(row<1){
            return ans;
        }
        int col = matrix[0].length;
        int startR = 0;
        int startCol = 0;
        int i =0;
        
        while(startR<row&& startCol<col){
            for(i= startCol; i< col; ++i){
                ans.add(matrix[startR][i]);
            }
            startR++;
            for(i = startR; i<row;++i){
                ans.add(matrix[i][col-1]);
            }
            col--;
            if(startR<row){
                for(i = col-1; i>=startCol;--i){
                    ans.add(matrix[row-1][i]);
                }
                row--;
            }
            if(startCol<col){
                for(i = row-1; i>=startR;--i){
                    ans.add(matrix[i][startCol]);
                }
                startCol++;
            }
        }
        return ans;
    }
}



// class Solution {
//     public List<Integer> spiralOrder(int[][] matrix) {
//         List<Integer> list = new ArrayList<>();
//         int m = matrix.length;
//         int n = matrix[0].length;
//         int start = 0;
//         int back = n-1;
//         int top = 0;
//         int bottom = m-1;

//         int i = 0;
//         while(i < n/2) {

//             for(int j = start; j <= back; j++) {
//                 list.add(matrix[start][j]);
//             }
//             start += 1;
//             for(int j = start; j <= bottom; j++) {
//                 list.add(matrix[j][back]);
//             }
//             back -= 1;
//             for(int j = back; j >= 0; j--) {
//                 list.add(matrix[bottom][j]);
//             }
//             bottom -= 1;
//             for(int j = bottom; j > top; j--) {
//                 list.add(matrix[j][top]);
//             }
//             top += 1;

//             i++;
//         }


//         return list;

//     }
// }