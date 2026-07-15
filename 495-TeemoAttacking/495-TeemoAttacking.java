// Last updated: 15/07/2026, 14:59:35
class Solution {
    public int findPoisonedDuration(int[] timeSeries,int duration) {
        if(timeSeries.length==0){
            return 0;
        }
        int sum=duration;
        for(int i=1;i<timeSeries.length;i++){
            if(timeSeries[i]-timeSeries[i-1]>=duration){
                sum=sum+duration;
            }else{
                sum=sum+timeSeries[i]-timeSeries[i-1];
            }
        }
        return sum;
    }
}