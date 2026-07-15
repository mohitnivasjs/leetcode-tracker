// Last updated: 15/07/2026, 15:00:41
class Solution {
    public int search(int[] nums,int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}