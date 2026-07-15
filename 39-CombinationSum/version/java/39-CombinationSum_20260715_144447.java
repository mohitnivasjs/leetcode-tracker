// Last updated: 15/07/2026, 14:44:47
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> combinationSum(int[] candidates,int target) {
5        List<List<Integer>> ans=new ArrayList<>();
6        find(candidates,target,0,new ArrayList<>(),ans);
7        return ans;
8    }
9
10    public void find(int[] candidates,int target,int index,List<Integer> list,List<List<Integer>> ans){
11        if(target==0){
12            ans.add(new ArrayList<>(list));
13            return;
14        }
15        if(target<0){
16            return;
17        }
18        for(int i=index;i<candidates.length;i++){
19            list.add(candidates[i]);
20            find(candidates,target-candidates[i],i,list,ans);
21            list.remove(list.size()-1);
22        }
23    }
24}