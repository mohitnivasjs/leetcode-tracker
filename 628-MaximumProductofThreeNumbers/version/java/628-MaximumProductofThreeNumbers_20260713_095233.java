// Last updated: 13/07/2026, 09:52:33
1import java.util.*;
2
3class Solution {
4    public int maximumProduct(int[] nums) {
5        Arrays.sort(nums);
6        int n=nums.length;
7        int a=nums[n-1]*nums[n-2]*nums[n-3];
8        int b=nums[0]*nums[1]*nums[n-1];
9        if(a>b){
10            return a;
11        }
12        return b;
13    }
14}