// Last updated: 15/07/2026, 14:36:32
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> combinationSum2(int[] candidates,int target) {
5        Arrays.sort(candidates);
6        List<List<Integer>> ans=new ArrayList<>();
7        find(candidates,target,0,new ArrayList<>(),ans);
8        return ans;
9    }
10
11    public void find(int[] candidates,int target,int index,List<Integer> list,List<List<Integer>> ans){
12        if(target==0){
13            ans.add(new ArrayList<>(list));
14            return;
15        }
16        if(target<0){
17            return;
18        }
19        for(int i=index;i<candidates.length;i++){
20            if(i>index&&candidates[i]==candidates[i-1]){
21                continue;
22            }
23            list.add(candidates[i]);
24            find(candidates,target-candidates[i],i+1,list,ans);
25            list.remove(list.size()-1);
26        }
27    }
28}