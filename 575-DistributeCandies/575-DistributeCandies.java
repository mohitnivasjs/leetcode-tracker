// Last updated: 15/07/2026, 14:59:26
import java.util.*;

class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<candyType.length;i++){
            set.add(candyType[i]);
        }
        if(set.size()<candyType.length/2){
            return set.size();
        }
        return candyType.length/2;
    }
}