// Last updated: 09/07/2026, 09:45:51
class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int[] arr1 = new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
           arr1[i] = nums[i];
           arr1[i+nums.length] = nums[i];
        }
        return arr1;
    }
}