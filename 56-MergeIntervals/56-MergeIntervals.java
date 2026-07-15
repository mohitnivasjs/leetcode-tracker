// Last updated: 15/07/2026, 15:00:30
import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<int[]> list=new ArrayList<>();
        int[] cur=intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=cur[1]){
                if(intervals[i][1]>cur[1]){
                    cur[1]=intervals[i][1];
                }
            }else{
                list.add(cur);
                cur=intervals[i];
            }
        }
        list.add(cur);
        int[][] ans=new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}