package com.practice;

public class Day5_Best_Time_To_Buy_And_Sell_Stock_II {
    public static int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1) return 0;
        int maxProfit = 0;
        int lastPrice = 0;
        boolean isNeedToSell = false;
        for (int i = 0; i < prices.length; i++) {
            if (isNeedToSell) {
                if (prices[i] > lastPrice && (i == prices.length - 1 || prices[i + 1] < prices[i])) {
                    maxProfit += prices[i] - lastPrice;
                    lastPrice = prices[i];
                    isNeedToSell = false;
                }
            } else {
                if (lastPrice == 0 || prices[i] < lastPrice) {
                    if (i == prices.length - 1 || prices[i + 1] > prices[i]) {
                        lastPrice = prices[i];
                        isNeedToSell = true;
                    }
                }
            }
        }
        return maxProfit;
    }
}
