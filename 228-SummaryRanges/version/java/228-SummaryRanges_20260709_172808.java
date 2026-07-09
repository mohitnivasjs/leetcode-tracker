// Last updated: 09/07/2026, 17:28:08
1import java.util.*;
2
3class Solution {
4    public List<String> summaryRanges(int[] nums) {
5        List<String> list=new ArrayList<>();
6        if(nums.length==0){
7            return list;
8        }
9        int start=nums[0];
10        for(int i=1;i<=nums.length;i++){
11            if(i==nums.length||nums[i]!=nums[i-1]+1){
12                if(start==nums[i-1]){
13                    list.add(String.valueOf(start));
14                }else{
15                    list.add(start+"->"+nums[i-1]);
16                }
17                if(i<nums.length){
18                    start=nums[i];
19                }
20            }
21        }
22        return list;
23    }
24}