// Last updated: 15/07/2026, 15:00:33
class Solution {
    public int jump(int[] nums) {
        int jumps=0;
        int end=0;
        int far=0;
        for(int i=0;i<nums.length-1;i++){
            if(i+nums[i]>far){
                far=i+nums[i];
            }
            if(i==end){
                jumps++;
                end=far;
            }
        }
        return jumps;
    }
}