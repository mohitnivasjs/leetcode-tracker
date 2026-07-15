// Last updated: 15/07/2026, 15:01:52
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> permute(int[] nums) {
5        List<List<Integer>> ans=new ArrayList<>();
6        solve(nums,new boolean[nums.length],new ArrayList<>(),ans);
7        return ans;
8    }
9
10    public void solve(int[] nums,boolean[] used,List<Integer> list,List<List<Integer>> ans){
11        if(list.size()==nums.length){
12            ans.add(new ArrayList<>(list));
13            return;
14        }
15        for(int i=0;i<nums.length;i++){
16            if(!used[i]){
17                used[i]=true;
18                list.add(nums[i]);
19                solve(nums,used,list,ans);
20                list.remove(list.size()-1);
21                used[i]=false;
22            }
23        }
24    }
25}