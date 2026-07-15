// Last updated: 15/07/2026, 15:00:34
import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates,int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        find(candidates,target,0,new ArrayList<>(),ans);
        return ans;
    }

    public void find(int[] candidates,int target,int index,List<Integer> list,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(i>index&&candidates[i]==candidates[i-1]){
                continue;
            }
            list.add(candidates[i]);
            find(candidates,target-candidates[i],i+1,list,ans);
            list.remove(list.size()-1);
        }
    }
}