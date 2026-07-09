// Last updated: 09/07/2026, 12:24:36
class Solution {
    public int searchInsert(int[] nums, int target) {
        int pos=0;
        for(int i:nums){
            if(target==i) return pos;
            if(target<i) return pos;
            pos++;
        }
        return pos;
    }
}