// Last updated: 15/07/2026, 09:27:06
1class Solution {
2    public int pivotIndex(int[] nums) {
3        int total=0;
4        for(int i=0;i<nums.length;i++){
5            total=total+nums[i];
6        }
7        int left=0;
8        for(int i=0;i<nums.length;i++){
9            if(left==total-left-nums[i]){
10                return i;
11            }
12            left=left+nums[i];
13        }
14        return -1;
15    }
16}