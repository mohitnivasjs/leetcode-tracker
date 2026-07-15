// Last updated: 15/07/2026, 14:59:24
import java.util.*;

class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int x:map.keySet()){
            if(map.containsKey(x+1)){
                int sum=map.get(x)+map.get(x+1);
                if(sum>max){
                    max=sum;
                }
            }
        }
        return max;
    }
}