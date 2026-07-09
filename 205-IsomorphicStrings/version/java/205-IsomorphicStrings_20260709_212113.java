// Last updated: 09/07/2026, 21:21:13
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        char[] a=new char[256];
4        char[] b=new char[256];
5        for(int i=0;i<s.length();i++){
6            char c1=s.charAt(i);
7            char c2=t.charAt(i);
8            if(a[c1]==0&&b[c2]==0){
9                a[c1]=c2;
10                b[c2]=c1;
11            }else{
12                if(a[c1]!=c2||b[c2]!=c1){
13                    return false;
14                }
15            }
16        }
17        return true;
18    }
19}