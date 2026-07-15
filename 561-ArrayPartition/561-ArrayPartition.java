// Last updated: 15/07/2026, 14:59:29
import java.util.*;

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i=i+2){
            sum=sum+nums[i];
        }
        return sum;
    }
}