// Last updated: 22/08/2026, 16:06:37
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int len1 = nums1.length;
4        int len2 = nums2.length;
5        int[] merged = new int[len1+len2];
6        int i = 0;
7        int j = 0;
8        int k = 0;
9        while(i<len1 && j<len2){
10            if(nums1[i]<nums2[j]){
11                merged[k] = nums1[i];
12                i++;
13                k++;
14            }else{
15                merged[k] = nums2[j];
16                j++;
17                k++;
18            }
19        }
20        while(i<len1){
21            merged[k] = nums1[i];
22            i++;
23            k++;
24        }
25        while(j<len2){
26            merged[k] = nums2[j];
27            j++;
28            k++;
29        }
30        int total = merged.length;
31        if(total%2!=0){
32            return (double) merged[total/2];
33        }else{
34            int m1 = merged[total/2 - 1];
35            int m2 = merged[total/2];
36            double ans = (double)(m1+m2)/2;
37            return ans;
38        }
39    }
40}