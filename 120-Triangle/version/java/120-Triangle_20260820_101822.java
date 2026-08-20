// Last updated: 20/08/2026, 10:18:22
1import java.util.*;
2class Solution {
3    public int minimumTotal(List<List<Integer>> triangle) {
4        for(int i=triangle.size()-2;i>=0;i--){
5            for(int j=0;j<=i;j++){
6                int a=triangle.get(i+1).get(j);
7                int b=triangle.get(i+1).get(j+1);
8                triangle.get(i).set(j,triangle.get(i).get(j)+Math.min(a,b));
9            }
10        }
11        return triangle.get(0).get(0);
12    }
13}