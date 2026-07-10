// Last updated: 10/07/2026, 15:51:09
1class Solution {
2    public String[] findWords(String[] words) {
3        String a="qwertyuiopQWERTYUIOP";
4        String b="asdfghjklASDFGHJKL";
5        String c="zxcvbnmZXCVBNM";
6        java.util.ArrayList<String> list=new java.util.ArrayList<>();
7        for(int i=0;i<words.length;i++){
8            String s=words[i];
9            String row="";
10            if(a.indexOf(s.charAt(0))!=-1){
11                row=a;
12            }else if(b.indexOf(s.charAt(0))!=-1){
13                row=b;
14            }else{
15                row=c;
16            }
17            boolean ok=true;
18            for(int j=1;j<s.length();j++){
19                if(row.indexOf(s.charAt(j))==-1){
20                    ok=false;
21                    break;
22                }
23            }
24            if(ok){
25                list.add(s);
26            }
27        }
28        String[] ans=new String[list.size()];
29        for(int i=0;i<list.size();i++){
30            ans[i]=list.get(i);
31        }
32        return ans;
33    }
34}