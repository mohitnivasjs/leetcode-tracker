// Last updated: 14/07/2026, 18:14:42
1class Solution {
2    public boolean isOneBitCharacter(int[] bits) {
3        int i=0;
4        while(i<bits.length-1){
5            if(bits[i]==1){
6                i=i+2;
7            }else{
8                i++;
9            }
10        }
11        return i==bits.length-1;
12    }
13}