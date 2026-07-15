// Last updated: 15/07/2026, 15:00:12
class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                str=str+Character.toLowerCase(ch);
            }
        }
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        return str.equals(rev);
    }
}