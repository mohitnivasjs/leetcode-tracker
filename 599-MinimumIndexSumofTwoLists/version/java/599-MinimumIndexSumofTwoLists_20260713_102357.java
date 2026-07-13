// Last updated: 13/07/2026, 10:23:57
1import java.util.*;
2
3class Solution {
4    public String[] findRestaurant(String[] list1,String[] list2) {
5        HashMap<String,Integer> map=new HashMap<>();
6        for(int i=0;i<list1.length;i++){
7            map.put(list1[i],i);
8        }
9        ArrayList<String> list=new ArrayList<>();
10        int min=Integer.MAX_VALUE;
11        for(int i=0;i<list2.length;i++){
12            if(map.containsKey(list2[i])){
13                int sum=i+map.get(list2[i]);
14                if(sum<min){
15                    min=sum;
16                    list.clear();
17                    list.add(list2[i]);
18                }else if(sum==min){
19                    list.add(list2[i]);
20                }
21            }
22        }
23        String[] ans=new String[list.size()];
24        for(int i=0;i<list.size();i++){
25            ans[i]=list.get(i);
26        }
27        return ans;
28    }
29}