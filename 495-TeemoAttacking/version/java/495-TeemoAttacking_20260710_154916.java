// Last updated: 10/07/2026, 15:49:16
1class Solution {
2    public int findPoisonedDuration(int[] timeSeries,int duration) {
3        if(timeSeries.length==0){
4            return 0;
5        }
6        int sum=duration;
7        for(int i=1;i<timeSeries.length;i++){
8            if(timeSeries[i]-timeSeries[i-1]>=duration){
9                sum=sum+duration;
10            }else{
11                sum=sum+timeSeries[i]-timeSeries[i-1];
12            }
13        }
14        return sum;
15    }
16}