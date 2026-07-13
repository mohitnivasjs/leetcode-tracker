// Last updated: 13/07/2026, 09:47:55
1import java.util.*;
2
3class Solution {
4    public int distributeCandies(int[] candyType) {
5        HashSet<Integer> set=new HashSet<>();
6        for(int i=0;i<candyType.length;i++){
7            set.add(candyType[i]);
8        }
9        if(set.size()<candyType.length/2){
10            return set.size();
11        }
12        return candyType.length/2;
13    }
14}