package my.leetcode;

/**
 * https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/description/
 *
 * easy
 */
public class Q121 {

    public int maxProfit(int[] prices) {
        int max = 0;
        int low = prices[0];
        for (int i = 1; i < prices.length; i++) {
            max = Math.max(max, prices[i] - low);
            low = Math.min(prices[i], low);
        }

        return max;
    }
}
