// Last updated: 03/09/2026, 15:02:47
1class Solution {
2    public int myAtoi(String s) {
3        int i=0,n=s.length(),sign=1,num=0;
4        while(i<n&&s.charAt(i)==' ') i++;
5        if(i<n&&(s.charAt(i)=='+'||s.charAt(i)=='-')){
6            if(s.charAt(i)=='-') sign=-1;
7            i++;
8        }
9        while(i<n&&s.charAt(i)>='0'&&s.charAt(i)<='9'){
10            int d=s.charAt(i)-'0';
11            if(num>Integer.MAX_VALUE/10||(num==Integer.MAX_VALUE/10&&d>7))
12                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
13            num=num*10+d;
14            i++;
15        }
16        return num*sign;
17    }
18}