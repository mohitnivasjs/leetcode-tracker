// Last updated: 10/07/2026, 15:50:09
1class Solution {
2    public int[] nextGreaterElement(int[] nums1,int[] nums2) {
3        int[] ans=new int[nums1.length];
4        for(int i=0;i<nums1.length;i++){
5            int j=0;
6            while(nums2[j]!=nums1[i]){
7                j++;
8            }
9            ans[i]=-1;
10            for(int k=j+1;k<nums2.length;k++){
11                if(nums2[k]>nums1[i]){
12                    ans[i]=nums2[k];
13                    break;
14                }
15            }
16        }
17        return ans;
18    }
19}