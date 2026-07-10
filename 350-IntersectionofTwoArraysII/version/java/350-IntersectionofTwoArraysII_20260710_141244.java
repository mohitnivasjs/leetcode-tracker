// Last updated: 10/07/2026, 14:12:44
1import java.util.*;
2
3class Solution {
4    public int[] intersect(int[] nums1,int[] nums2) {
5        HashMap<Integer,Integer> map=new HashMap<>();
6        ArrayList<Integer> list=new ArrayList<>();
7        for(int i=0;i<nums1.length;i++){
8            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
9        }
10        for(int i=0;i<nums2.length;i++){
11            if(map.containsKey(nums2[i])&&map.get(nums2[i])>0){
12                list.add(nums2[i]);
13                map.put(nums2[i],map.get(nums2[i])-1);
14            }
15        }
16        int[] ans=new int[list.size()];
17        for(int i=0;i<list.size();i++){
18            ans[i]=list.get(i);
19        }
20        return ans;
21    }
22}