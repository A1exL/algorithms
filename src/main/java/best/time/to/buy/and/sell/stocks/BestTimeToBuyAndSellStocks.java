package best.time.to.buy.and.sell.stocks;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
// Kadane's Algorithm
public class BestTimeToBuyAndSellStocks {

    // [7,6,4,3,1] -> 0
    // [7,1,5,3,6,4] -> 6 - 1 = 5
    // [2, 5, 1] -> 3
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyPrice = prices[0];  // 2

        // 5, 1
        for (int i = 1; i < prices.length; i++) {
            int currentPrice = prices[i];
            buyPrice = Math.min(buyPrice, currentPrice);
            maxProfit = Math.max(maxProfit, currentPrice - buyPrice);
        }
        return maxProfit;
    }
}
