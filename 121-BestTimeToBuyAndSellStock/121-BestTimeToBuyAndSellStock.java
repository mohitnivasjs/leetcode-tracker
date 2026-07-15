// Last updated: 15/07/2026, 15:00:14
class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }else{
                if(prices[i]-min>profit){
                    profit=prices[i]-min;
                }
            }
        }
        return profit;
    }
}