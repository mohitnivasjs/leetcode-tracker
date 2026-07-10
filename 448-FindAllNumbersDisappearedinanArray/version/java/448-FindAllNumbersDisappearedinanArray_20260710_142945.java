// Last updated: 10/07/2026, 14:29:45
1import java.util.*;
2
3class Solution {
4    public List<Integer> findDisappearedNumbers(int[] nums) {
5        boolean[] seen=new boolean[nums.length+1];
6        List<Integer> list=new ArrayList<>();
7        for(int i=0;i<nums.length;i++){
8            seen[nums[i]]=true;
9        }
10        for(int i=1;i<=nums.length;i++){
11            if(!seen[i]){
12                list.add(i);
13            }
14        }
15        return list;
16    }
17}