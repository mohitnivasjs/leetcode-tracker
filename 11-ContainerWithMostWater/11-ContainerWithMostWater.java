// Last updated: 15/07/2026, 15:00:53
class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int max=0;
        while(i<j){
            int h;
            if(height[i]<height[j]){
                h=height[i];
            }else{
                h=height[j];
            }
            int area=h*(j-i);
            if(area>max){
                max=area;
            }
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}