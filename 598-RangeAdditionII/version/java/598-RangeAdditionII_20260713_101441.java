// Last updated: 13/07/2026, 10:14:41
1class Solution {
2    public int maxCount(int m,int n,int[][] ops) {
3        for(int i=0;i<ops.length;i++){
4            if(ops[i][0]<m){
5                m=ops[i][0];
6            }
7            if(ops[i][1]<n){
8                n=ops[i][1];
9            }
10        }
11        return m*n;
12    }
13}