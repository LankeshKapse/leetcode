package org.lucky.leetcode.easy.arrays;

public class BuyAndSell {
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int min_index=-1;
        int max_profit=0;

        for(int i=0; i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
                min_index=i;
            }
            if(min_index<i && prices[i] - min > max_profit){
                max_profit=prices[i] - min;
            }
        }
        return max_profit;
    }
}
