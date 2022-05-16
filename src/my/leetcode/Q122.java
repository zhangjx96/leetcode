package my.leetcode;

/**
 * https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii/
 * <p>
 * medium
 * <p>
 * 没劲
 */
public class Q122 {

    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - prices[i - 1] > 0)
                max += prices[i] - prices[i - 1];
        }
        return max;
    }

    public static void main(String[] args) {
        Q122 q122 = new Q122();

        q122.maxProfit(new int[]{6, 1, 3, 2, 4, 7});
    }
}
