package my.leetcode.lcof;

/**
 * https://leetcode.cn/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/
 *
 * medium
 *
 */
public class Q13 {

    public int movingCount(int m, int n, int k) {
        boolean[][] dp = new boolean[m][n];

        dp[0][0] = true;
        int num = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j == 0) || ((count(i) + count(j) > k))) {
                    continue;
                }
                if (i - 1 < 0) {
                    dp[i][j] = dp[i][j - 1];
                } else if (j - 1 < 0) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                }
                if(dp[i][j])
                    num += 1;
            }
        }

        return num;
    }

    private int count(int x) {
        int res = 0;
        while (x != 0) {
            res += x % 10;
            x /= 10;
        }
        return res;
    }

}
