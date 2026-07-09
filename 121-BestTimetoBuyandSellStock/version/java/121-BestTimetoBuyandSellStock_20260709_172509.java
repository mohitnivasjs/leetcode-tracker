// Last updated: 09/07/2026, 17:25:09
1class Solution {
2    public int maxProfit(int[] prices) {
3        int min=prices[0];
4        int profit=0;
5        for(int i=1;i<prices.length;i++){
6            if(prices[i]<min){
7                min=prices[i];
8            }else{
9                if(prices[i]-min>profit){
10                    profit=prices[i]-min;
11                }
12            }
13        }
14        return profit;
15    }
16}