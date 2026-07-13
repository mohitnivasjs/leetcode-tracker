// Last updated: 13/07/2026, 10:14:29
1class Solution {
2    public boolean canPlaceFlowers(int[] flowerbed,int n) {
3        for(int i=0;i<flowerbed.length;i++){
4            if(flowerbed[i]==0){
5                boolean left=(i==0||flowerbed[i-1]==0);
6                boolean right=(i==flowerbed.length-1||flowerbed[i+1]==0);
7                if(left&&right){
8                    flowerbed[i]=1;
9                    n--;
10                }
11            }
12        }
13        return n<=0;
14    }
15}