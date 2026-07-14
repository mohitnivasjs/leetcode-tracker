// Last updated: 14/07/2026, 18:10:27
1import java.util.*;
2
3class Solution {
4    public int findShortestSubArray(int[] nums) {
5        HashMap<Integer,Integer> count=new HashMap<>();
6        HashMap<Integer,Integer> first=new HashMap<>();
7        int max=0;
8        int ans=nums.length;
9        for(int i=0;i<nums.length;i++){
10            if(!first.containsKey(nums[i])){
11                first.put(nums[i],i);
12            }
13            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
14            if(count.get(nums[i])>max){
15                max=count.get(nums[i]);
16                ans=i-first.get(nums[i])+1;
17            }else if(count.get(nums[i])==max){
18                ans=Math.min(ans,i-first.get(nums[i])+1);
19            }
20        }
21        return ans;
22    }
23}