// Last updated: 15/07/2026, 14:59:31
import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] temp=score.clone();
        Arrays.sort(temp);
        HashMap<Integer,String> map=new HashMap<>();
        int n=temp.length;
        for(int i=0;i<n;i++){
            if(i==n-1){
                map.put(temp[i],"Gold Medal");
            }else if(i==n-2){
                map.put(temp[i],"Silver Medal");
            }else if(i==n-3){
                map.put(temp[i],"Bronze Medal");
            }else{
                map.put(temp[i],String.valueOf(n-i));
            }
        }
        String[] ans=new String[n];
        for(int i=0;i<n;i++){
            ans[i]=map.get(score[i]);
        }
        return ans;
    }
}