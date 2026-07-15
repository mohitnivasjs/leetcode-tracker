// Last updated: 15/07/2026, 14:59:11
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int count=1;
        int max=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                count++;
            }else{
                count=1;
            }
            if(count>max){
                max=count;
            }
        }
        return max;
    }
}