// Last updated: 13/07/2026, 11:33:55
1class Solution {
2    public int[][] imageSmoother(int[][] img) {
3        int m=img.length;
4        int n=img[0].length;
5        int[][] ans=new int[m][n];
6        for(int i=0;i<m;i++){
7            for(int j=0;j<n;j++){
8                int sum=0;
9                int count=0;
10                for(int x=i-1;x<=i+1;x++){
11                    for(int y=j-1;y<=j+1;y++){
12                        if(x>=0&&x<m&&y>=0&&y<n){
13                            sum=sum+img[x][y];
14                            count++;
15                        }
16                    }
17                }
18                ans[i][j]=sum/count;
19            }
20        }
21        return ans;
22    }
23}