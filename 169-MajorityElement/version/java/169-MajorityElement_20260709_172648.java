// Last updated: 09/07/2026, 17:26:48
1class Solution {
2    public int majorityElement(int[] nums) {
3        int count=0;
4        int ans=0;
5        for(int i=0;i<nums.length;i++){
6            if(count==0){
7                ans=nums[i];
8            }
9            if(nums[i]==ans){
10                count++;
11            }else{
12                count--;
13            }
14        }
15        return ans;
16    }
17}