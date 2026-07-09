// Last updated: 09/07/2026, 21:22:54
1import java.util.*;
2
3class Solution {
4    public boolean wordPattern(String pattern, String s) {
5        String[] a=s.split(" ");
6        if(pattern.length()!=a.length){
7            return false;
8        }
9        HashMap<Character,String> map1=new HashMap<>();
10        HashMap<String,Character> map2=new HashMap<>();
11        for(int i=0;i<pattern.length();i++){
12            char ch=pattern.charAt(i);
13            if(map1.containsKey(ch)){
14                if(!map1.get(ch).equals(a[i])){
15                    return false;
16                }
17            }else{
18                if(map2.containsKey(a[i])){
19                    return false;
20                }
21                map1.put(ch,a[i]);
22                map2.put(a[i],ch);
23            }
24        }
25        return true;
26    }
27}