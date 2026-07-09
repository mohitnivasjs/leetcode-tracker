// Last updated: 09/07/2026, 21:22:03
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length()!=t.length()){
4            return false;
5        }
6        int[] a=new int[26];
7        for(int i=0;i<s.length();i++){
8            a[s.charAt(i)-'a']++;
9            a[t.charAt(i)-'a']--;
10        }
11        for(int i=0;i<26;i++){
12            if(a[i]!=0){
13                return false;
14            }
15        }
16        return true;
17    }
18}