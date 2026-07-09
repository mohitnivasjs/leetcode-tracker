// Last updated: 09/07/2026, 17:28:38
1class Solution {
2    public int missingNumber(int[] nums) {
3        int sum=0;
4        int total=0;
5        for(int i=0;i<nums.length;i++){
6            sum=sum+nums[i];
7            total=total+i;
8        }
9        total=total+nums.length;
10        return total-sum;
11    }
12}