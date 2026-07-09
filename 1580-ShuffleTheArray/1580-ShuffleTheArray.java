// Last updated: 09/07/2026, 09:45:54
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] x=new int[n*2];
        int k=0;
        for(int i=0,j=n;i<n && j<nums.length;i++,j++){
            x[k]=nums[i];
            x[++k]=nums[j];
            ++k;
        }
        return x;
    }
}