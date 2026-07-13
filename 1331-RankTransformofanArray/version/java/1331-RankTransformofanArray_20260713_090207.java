// Last updated: 13/07/2026, 09:02:07
1import java.util.*;
2
3class Solution {
4    public int[] arrayRankTransform(int[] arr) {
5        int[] temp=arr.clone();
6        Arrays.sort(temp);
7        HashMap<Integer,Integer> map=new HashMap<>();
8        int rank=1;
9        for(int i=0;i<temp.length;i++){
10            if(!map.containsKey(temp[i])){
11                map.put(temp[i],rank);
12                rank++;
13            }
14        }
15        for(int i=0;i<arr.length;i++){
16            arr[i]=map.get(arr[i]);
17        }
18        return arr;
19    }
20}