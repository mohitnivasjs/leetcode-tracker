// Last updated: 15/07/2026, 14:59:18
import java.util.*;

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int a=nums[n-1]*nums[n-2]*nums[n-3];
        int b=nums[0]*nums[1]*nums[n-1];
        if(a>b){
            return a;
        }
        return b;
    }
}