package my.leetcode.greedy;

import java.util.*;

/**
 * https://leetcode.cn/problems/candy/
 * <p>
 * hard
 */
public class Q135 {

    public int candy(int[] ratings) {
        int[] candy = new int[ratings.length];

        candy[0] = 1;
        for (int i = 1; i < ratings.length; i++) {
            candy[i] = ratings[i] > ratings[i - 1] ? candy[i - 1] + 1 : 1;
        }

        int all = candy[candy.length - 1];
        for (int i = ratings.length - 2; i >= 0; i--) {
            candy[i] = ratings[i] > ratings[i + 1] ? Math.max(candy[i + 1] + 1, candy[i]) : candy[i];
            all += candy[i];
        }
        return all;
    }
}
