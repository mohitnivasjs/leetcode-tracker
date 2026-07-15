// Last updated: 15/07/2026, 15:00:00
import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        if(nums.length==0){
            return list;
        }
        int start=nums[0];
        for(int i=1;i<=nums.length;i++){
            if(i==nums.length||nums[i]!=nums[i-1]+1){
                if(start==nums[i-1]){
                    list.add(String.valueOf(start));
                }else{
                    list.add(start+"->"+nums[i-1]);
                }
                if(i<nums.length){
                    start=nums[i];
                }
            }
        }
        return list;
    }
}