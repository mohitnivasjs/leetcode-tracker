// Last updated: 15/07/2026, 09:39:23
1class Solution {
2    public void nextPermutation(int[] nums) {
3        int i=nums.length-2;
4        while(i>=0&&nums[i]>=nums[i+1]){
5            i--;
6        }
7        if(i>=0){
8            int j=nums.length-1;
9            while(nums[j]<=nums[i]){
10                j--;
11            }
12            int t=nums[i];
13            nums[i]=nums[j];
14            nums[j]=t;
15        }
16        reverse(nums,i+1,nums.length-1);
17    }
18
19    public void reverse(int[] nums,int l,int r){
20        while(l<r){
21            int t=nums[l];
22            nums[l]=nums[r];
23            nums[r]=t;
24            l++;
25            r--;
26        }
27    }
28}