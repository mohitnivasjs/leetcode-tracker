// Last updated: 09/07/2026, 21:17:37
1class Solution {
2    public int strStr(String haystack, String needle) {
3        for(int i=0;i<haystack.length();i++){
4            int j=0;
5            while(i+j<haystack.length()&&j<needle.length()&&haystack.charAt(i+j)==needle.charAt(j)){
6                j++;
7            }
8            if(j==needle.length()){
9                return i;
10            }
11        }
12        return -1;
13    }
14}