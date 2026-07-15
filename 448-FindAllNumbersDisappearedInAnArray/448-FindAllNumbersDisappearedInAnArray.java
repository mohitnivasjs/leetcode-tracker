// Last updated: 15/07/2026, 14:59:42
import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] seen=new boolean[nums.length+1];
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            seen[nums[i]]=true;
        }
        for(int i=1;i<=nums.length;i++){
            if(!seen[i]){
                list.add(i);
            }
        }
        return list;
    }
}