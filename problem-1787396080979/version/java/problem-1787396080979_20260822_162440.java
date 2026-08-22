// Last updated: 22/08/2026, 16:24:40
1class Solution {
2    public String longestPalindrome(String s) {
3        int maxLen=0;
4        int start=0;
5        for(int i=0; i<s.length(); i++){
6            int l=i;
7            int r=i;
8            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
9                int len=r-l+1;
10                if(len>maxLen){
11                    maxLen=len;
12                    start=l;
13                }
14                l--;
15                r++;
16            }
17            l=i;
18            r=i+1;
19            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
20                int len=r-l+1;
21                if(len>maxLen){
22                    maxLen=len;
23                    start=l;
24                }
25                l--;
26                r++;
27            }
28        }
29        return s.substring(start, start+maxLen);
30    }
31}