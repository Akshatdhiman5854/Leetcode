class Solution {
    public int islandPerimeter(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int islands = 0;
        int neighbours = 0;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(grid[i][j] == 1) {
                    islands++;
                    if(i-1 >= 0 && grid[i-1][j] == 1) {
                        neighbours++;
                    }
                    if(j-1 >= 0 && grid[i][j-1] == 1) {
                        neighbours++;
                    }
                }
            }
        }

        return islands*4-neighbours*2;
    }
}