// Last updated: 15/07/2026, 14:59:39
class Solution {
    public int islandPerimeter(int[][] grid) {
        int p=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    p=p+4;
                    if(i>0&&grid[i-1][j]==1){
                        p=p-2;
                    }
                    if(j>0&&grid[i][j-1]==1){
                        p=p-2;
                    }
                }
            }
        }
        return p;
    }
}