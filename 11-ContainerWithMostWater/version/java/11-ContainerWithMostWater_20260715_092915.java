// Last updated: 15/07/2026, 09:29:15
1class Solution {
2    public int maxArea(int[] height) {
3        int i=0;
4        int j=height.length-1;
5        int max=0;
6        while(i<j){
7            int h;
8            if(height[i]<height[j]){
9                h=height[i];
10            }else{
11                h=height[j];
12            }
13            int area=h*(j-i);
14            if(area>max){
15                max=area;
16            }
17            if(height[i]<height[j]){
18                i++;
19            }else{
20                j--;
21            }
22        }
23        return max;
24    }
25}