// Last updated: 15/07/2026, 14:59:23
class Solution {
    public int maxCount(int m,int n,int[][] ops) {
        for(int i=0;i<ops.length;i++){
            if(ops[i][0]<m){
                m=ops[i][0];
            }
            if(ops[i][1]<n){
                n=ops[i][1];
            }
        }
        return m*n;
    }
}