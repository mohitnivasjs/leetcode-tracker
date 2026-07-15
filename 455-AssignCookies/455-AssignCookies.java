// Last updated: 15/07/2026, 14:59:41
import java.util.*;

class Solution {
    public int findContentChildren(int[] g,int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        while(i<g.length&&j<s.length){
            if(s[j]>=g[i]){
                i++;
            }
            j++;
        }
        return i;
    }
}