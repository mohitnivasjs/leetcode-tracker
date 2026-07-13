// Last updated: 13/07/2026, 09:00:54
1import java.util.*;
2
3class Solution {
4    public int arrayPairSum(int[] nums) {
5        Arrays.sort(nums);
6        int sum=0;
7        for(int i=0;i<nums.length;i=i+2){
8            sum=sum+nums[i];
9        }
10        return sum;
11    }
12}