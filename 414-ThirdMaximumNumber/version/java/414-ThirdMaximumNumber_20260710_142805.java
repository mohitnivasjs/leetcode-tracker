// Last updated: 10/07/2026, 14:28:05
1class Solution {
2    public int thirdMax(int[] nums) {
3        java.util.Arrays.sort(nums);
4        int count=1;
5        int ans=nums[nums.length-1];
6        for(int i=nums.length-2;i>=0;i--){
7            if(nums[i]!=ans){
8                count++;
9                ans=nums[i];
10                if(count==3){
11                    return ans;
12                }
13            }
14        }
15        return nums[nums.length-1];
16    }
17}