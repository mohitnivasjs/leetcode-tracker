// Last updated: 14/07/2026, 18:04:57
1class Solution {
2    public int[][] matrixReshape(int[][] mat,int r,int c) {
3        int m=mat.length;
4        int n=mat[0].length;
5        if(m*n!=r*c){
6            return mat;
7        }
8        int[][] ans=new int[r][c];
9        int x=0;
10        int y=0;
11        for(int i=0;i<m;i++){
12            for(int j=0;j<n;j++){
13                ans[x][y]=mat[i][j];
14                y++;
15                if(y==c){
16                    y=0;
17                    x++;
18                }
19            }
20        }
21        return ans;
22    }
23}