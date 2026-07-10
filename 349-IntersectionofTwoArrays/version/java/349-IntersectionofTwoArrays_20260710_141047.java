// Last updated: 10/07/2026, 14:10:47
1import java.util.*;
2
3class Solution {
4    public int[] intersection(int[] nums1,int[] nums2) {
5        HashSet<Integer> set1=new HashSet<>();
6        HashSet<Integer> set2=new HashSet<>();
7        for(int i=0;i<nums1.length;i++){
8            set1.add(nums1[i]);
9        }
10        for(int i=0;i<nums2.length;i++){
11            if(set1.contains(nums2[i])){
12                set2.add(nums2[i]);
13            }
14        }
15        int[] ans=new int[set2.size()];
16        int i=0;
17        for(int x:set2){
18            ans[i]=x;
19            i++;
20        }
21        return ans;
22    }
23}