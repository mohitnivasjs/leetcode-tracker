// Last updated: 09/07/2026, 21:23:56
1class Solution {
2    public void reverseString(char[] s) {
3        int i=0;
4        int j=s.length-1;
5        while(i<j){
6            char t=s[i];
7            s[i]=s[j];
8            s[j]=t;
9            i++;
10            j--;
11        }
12    }
13}