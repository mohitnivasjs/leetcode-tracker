// Last updated: 09/07/2026, 17:27:23
1import java.util.*;
2
3class Solution {
4    public boolean containsDuplicate(int[] nums) {
5        HashSet<Integer> set=new HashSet<>();
6        for(int i=0;i<nums.length;i++){
7            if(set.contains(nums[i])){
8                return true;
9            }
10            set.add(nums[i]);
11        }
12        return false;
13    }
14}