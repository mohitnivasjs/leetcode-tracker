// Last updated: 15/07/2026, 14:59:55
class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int total=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            total=total+i;
        }
        total=total+nums.length;
        return total-sum;
    }
}