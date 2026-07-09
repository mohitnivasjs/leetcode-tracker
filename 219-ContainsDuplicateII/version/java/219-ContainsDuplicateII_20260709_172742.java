// Last updated: 09/07/2026, 17:27:42
1import java.util.*;
2
3class Solution {
4    public boolean containsNearbyDuplicate(int[] nums, int k) {
5        HashMap<Integer,Integer> map=new HashMap<>();
6        for(int i=0;i<nums.length;i++){
7            if(map.containsKey(nums[i])&&i-map.get(nums[i])<=k){
8                return true;
9            }
10            map.put(nums[i],i);
11        }
12        return false;
13    }
14}