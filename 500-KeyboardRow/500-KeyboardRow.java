// Last updated: 15/07/2026, 14:59:32
class Solution {
    public String[] findWords(String[] words) {
        String a="qwertyuiopQWERTYUIOP";
        String b="asdfghjklASDFGHJKL";
        String c="zxcvbnmZXCVBNM";
        java.util.ArrayList<String> list=new java.util.ArrayList<>();
        for(int i=0;i<words.length;i++){
            String s=words[i];
            String row="";
            if(a.indexOf(s.charAt(0))!=-1){
                row=a;
            }else if(b.indexOf(s.charAt(0))!=-1){
                row=b;
            }else{
                row=c;
            }
            boolean ok=true;
            for(int j=1;j<s.length();j++){
                if(row.indexOf(s.charAt(j))==-1){
                    ok=false;
                    break;
                }
            }
            if(ok){
                list.add(s);
            }
        }
        String[] ans=new String[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}