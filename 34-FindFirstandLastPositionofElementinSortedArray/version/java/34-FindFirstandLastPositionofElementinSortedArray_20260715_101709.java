// Last updated: 15/07/2026, 10:17:09
1class Solution {
2    public int[] searchRange(int[] nums,int target) {
3        int[] ans={-1,-1};
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]==target){
6                if(ans[0]==-1){
7                    ans[0]=i;
8                }
9                ans[1]=i;
10            }
11        }
12        return ans;
13    }
14}