package primary.array;

/**
 *
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。

 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 */
public class MaxProfit {

    public int maxProfit(int[] prices) {
        int profit = 0;
        int totalProfit = 0;
        for (int i=0; i<prices.length - 1; i++) {
            if (prices[i+1] > prices[i]) {
                profit = prices[i+1] - prices[i];
                totalProfit = totalProfit + profit;
            }
        }
        return totalProfit;
    }

    public static void main(String[] args) {
        MaxProfit maxProfit = new MaxProfit();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit.maxProfit(prices));
    }
}
