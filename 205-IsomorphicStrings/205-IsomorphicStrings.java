// Last updated: 15/07/2026, 15:00:05
class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] a=new char[256];
        char[] b=new char[256];
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(a[c1]==0&&b[c2]==0){
                a[c1]=c2;
                b[c2]=c1;
            }else{
                if(a[c1]!=c2||b[c2]!=c1){
                    return false;
                }
            }
        }
        return true;
    }
}