// Last updated: 14/07/2026, 18:05:17
1class Solution {
2    public double findMaxAverage(int[] nums,int k) {
3        int sum=0;
4        for(int i=0;i<k;i++){
5            sum=sum+nums[i];
6        }
7        int max=sum;
8        for(int i=k;i<nums.length;i++){
9            sum=sum+nums[i]-nums[i-k];
10            if(sum>max){
11                max=sum;
12            }
13        }
14        return (double)max/k;
15    }
16}