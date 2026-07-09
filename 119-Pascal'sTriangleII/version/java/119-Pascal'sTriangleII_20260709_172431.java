// Last updated: 09/07/2026, 17:24:31
1import java.util.*;
2
3class Solution {
4    public List<Integer> getRow(int rowIndex) {
5        List<List<Integer>> list=new ArrayList<>();
6        for(int i=0;i<=rowIndex;i++){
7            List<Integer> temp=new ArrayList<>();
8            for(int j=0;j<=i;j++){
9                if(j==0||j==i){
10                    temp.add(1);
11                }else{
12                    int a=list.get(i-1).get(j-1);
13                    int b=list.get(i-1).get(j);
14                    temp.add(a+b);
15                }
16            }
17            list.add(temp);
18        }
19        return list.get(rowIndex);
20    }
21}