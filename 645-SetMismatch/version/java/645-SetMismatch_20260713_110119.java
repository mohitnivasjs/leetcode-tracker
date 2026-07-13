// Last updated: 13/07/2026, 11:01:19
1class Solution {
2    public int[] findErrorNums(int[] nums) {
3        int[] count=new int[nums.length+1];
4        int[] ans=new int[2];
5        for(int i=0;i<nums.length;i++){
6            count[nums[i]]++;
7        }
8        for(int i=1;i<=nums.length;i++){
9            if(count[i]==2){
10                ans[0]=i;
11            }
12            if(count[i]==0){
13                ans[1]=i;
14            }
15        }
16        return ans;
17    }
18}
19