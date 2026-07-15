// Last updated: 15/07/2026, 14:59:53
import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] a=s.split(" ");
        if(pattern.length()!=a.length){
            return false;
        }
        HashMap<Character,String> map1=new HashMap<>();
        HashMap<String,Character> map2=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            if(map1.containsKey(ch)){
                if(!map1.get(ch).equals(a[i])){
                    return false;
                }
            }else{
                if(map2.containsKey(a[i])){
                    return false;
                }
                map1.put(ch,a[i]);
                map2.put(a[i],ch);
            }
        }
        return true;
    }
}