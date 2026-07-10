// Last updated: 10/07/2026, 15:47:57
1class Solution {
2    public int islandPerimeter(int[][] grid) {
3        int p=0;
4        for(int i=0;i<grid.length;i++){
5            for(int j=0;j<grid[0].length;j++){
6                if(grid[i][j]==1){
7                    p=p+4;
8                    if(i>0&&grid[i-1][j]==1){
9                        p=p-2;
10                    }
11                    if(j>0&&grid[i][j-1]==1){
12                        p=p-2;
13                    }
14                }
15            }
16        }
17        return p;
18    }
19}