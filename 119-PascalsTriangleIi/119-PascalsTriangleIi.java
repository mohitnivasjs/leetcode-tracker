// Last updated: 15/07/2026, 15:00:16
import java.util.*;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    temp.add(1);
                }else{
                    int a=list.get(i-1).get(j-1);
                    int b=list.get(i-1).get(j);
                    temp.add(a+b);
                }
            }
            list.add(temp);
        }
        return list.get(rowIndex);
    }
}