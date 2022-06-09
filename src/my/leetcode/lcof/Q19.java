package my.leetcode.lcof;

/**
 * https://leetcode.cn/problems/zheng-ze-biao-da-shi-pi-pei-lcof/
 * <p>
 * hard
 */
public class Q19 {

    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();

        boolean[][] dp = new boolean[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                }

                if (j > 0) {
                    if (p.charAt(j - 1) != '*') {
                        if (i > 0 && (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.')) {
                            dp[i][j] = dp[i - 1][j - 1];
                        }
                    } else {
                        if(j >= 2){
                            dp[i][j] = dp[i][j - 2];
                        }
                        if (j >= 2 && i >= 1 && (p.charAt(j - 2) == '.' || p.charAt(j - 2) == s.charAt(i - 1))) {
                            dp[i][j] |= dp[i - 1][j];
                        }
                    }
                }
            }

        }


        return dp[m][n];
    }
}
