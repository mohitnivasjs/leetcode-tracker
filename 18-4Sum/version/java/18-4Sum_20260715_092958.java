// Last updated: 15/07/2026, 09:29:58
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> fourSum(int[] nums, int target) {
5        Arrays.sort(nums);
6        List<List<Integer>> ans=new ArrayList<>();
7        int n=nums.length;
8        for(int i=0;i<n-3;i++){
9            if(i>0&&nums[i]==nums[i-1]){
10                continue;
11            }
12            for(int j=i+1;j<n-2;j++){
13                if(j>i+1&&nums[j]==nums[j-1]){
14                    continue;
15                }
16                int l=j+1;
17                int r=n-1;
18                while(l<r){
19                    long sum=(long)nums[i]+nums[j]+nums[l]+nums[r];
20                    if(sum==target){
21                        ans.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
22                        l++;
23                        r--;
24                        while(l<r&&nums[l]==nums[l-1]){
25                            l++;
26                        }
27                        while(l<r&&nums[r]==nums[r+1]){
28                            r--;
29                        }
30                    }else if(sum<target){
31                        l++;
32                    }else{
33                        r--;
34                    }
35                }
36            }
37        }
38        return ans;
39    }
40}