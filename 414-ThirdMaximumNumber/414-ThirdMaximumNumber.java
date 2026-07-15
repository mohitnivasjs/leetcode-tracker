// Last updated: 15/07/2026, 14:59:44
class Solution {
    public int thirdMax(int[] nums) {
        java.util.Arrays.sort(nums);
        int count=1;
        int ans=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]!=ans){
                count++;
                ans=nums[i];
                if(count==3){
                    return ans;
                }
            }
        }
        return nums[nums.length-1];
    }
}