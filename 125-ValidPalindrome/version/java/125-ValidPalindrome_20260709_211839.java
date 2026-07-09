// Last updated: 09/07/2026, 21:18:39
1class Solution {
2    public boolean isPalindrome(String s) {
3        String str="";
4        for(int i=0;i<s.length();i++){
5            char ch=s.charAt(i);
6            if(Character.isLetterOrDigit(ch)){
7                str=str+Character.toLowerCase(ch);
8            }
9        }
10        String rev="";
11        for(int i=str.length()-1;i>=0;i--){
12            rev=rev+str.charAt(i);
13        }
14        return str.equals(rev);
15    }
16}