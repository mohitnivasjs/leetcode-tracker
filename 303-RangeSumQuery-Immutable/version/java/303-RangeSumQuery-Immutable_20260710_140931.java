// Last updated: 10/07/2026, 14:09:31
1class NumArray {
2    int[] nums;
3    public NumArray(int[] nums) {
4        this.nums=nums;
5    }
6    public int sumRange(int left,int right) {
7        int sum=0;
8        for(int i=left;i<=right;i++){
9            sum=sum+nums[i];
10        }
11        return sum;
12    }
13}
14
15/**
16 * Your NumArray object will be instantiated and called as such:
17 * NumArray obj = new NumArray(nums);
18 * int param_1 = obj.sumRange(left,right);
19 */