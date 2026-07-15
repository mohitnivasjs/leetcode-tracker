// Last updated: 15/07/2026, 14:59:05
class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            total=total+nums[i];
        }
        int left=0;
        for(int i=0;i<nums.length;i++){
            if(left==total-left-nums[i]){
                return i;
            }
            left=left+nums[i];
        }
        return -1;
    }
}