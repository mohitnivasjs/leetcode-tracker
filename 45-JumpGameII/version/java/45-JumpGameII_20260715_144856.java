// Last updated: 15/07/2026, 14:48:56
1class Solution {
2    public int jump(int[] nums) {
3        int jumps=0;
4        int end=0;
5        int far=0;
6        for(int i=0;i<nums.length-1;i++){
7            if(i+nums[i]>far){
8                far=i+nums[i];
9            }
10            if(i==end){
11                jumps++;
12                end=far;
13            }
14        }
15        return jumps;
16    }
17}