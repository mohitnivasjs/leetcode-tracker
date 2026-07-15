// Last updated: 15/07/2026, 16:00:40
1import java.util.*;
2
3class Solution {
4    public List<List<String>> groupAnagrams(String[] strs) {
5        HashMap<String,List<String>> map=new HashMap<>();
6        for(int i=0;i<strs.length;i++){
7            char[] ch=strs[i].toCharArray();
8            Arrays.sort(ch);
9            String s=new String(ch);
10            if(!map.containsKey(s)){
11                map.put(s,new ArrayList<>());
12            }
13            map.get(s).add(strs[i]);
14        }
15        return new ArrayList<>(map.values());
16    }
17}