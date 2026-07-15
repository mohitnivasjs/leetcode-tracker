// Last updated: 15/07/2026, 15:18:31
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> permuteUnique(int[] nums) {
5        Arrays.sort(nums);
6        List<List<Integer>> ans=new ArrayList<>();
7        solve(nums,new boolean[nums.length],new ArrayList<>(),ans);
8        return ans;
9    }
10
11    public void solve(int[] nums,boolean[] used,List<Integer> list,List<List<Integer>> ans){
12        if(list.size()==nums.length){
13            ans.add(new ArrayList<>(list));
14            return;
15        }
16        for(int i=0;i<nums.length;i++){
17            if(used[i]){
18                continue;
19            }
20            if(i>0&&nums[i]==nums[i-1]&&!used[i-1]){
21                continue;
22            }
23            used[i]=true;
24            list.add(nums[i]);
25            solve(nums,used,list,ans);
26            list.remove(list.size()-1);
27            used[i]=false;
28        }
29    }
30}