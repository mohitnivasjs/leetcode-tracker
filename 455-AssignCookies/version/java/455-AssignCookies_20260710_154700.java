// Last updated: 10/07/2026, 15:47:00
1import java.util.*;
2
3class Solution {
4    public int findContentChildren(int[] g,int[] s) {
5        Arrays.sort(g);
6        Arrays.sort(s);
7        int i=0;
8        int j=0;
9        while(i<g.length&&j<s.length){
10            if(s[j]>=g[i]){
11                i++;
12            }
13            j++;
14        }
15        return i;
16    }
17}