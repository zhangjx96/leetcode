package my.leetcode.lcof;

/**
 * https://leetcode.cn/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/
 * <p>
 * easy
 */
public class Q17 {

    public int[] printNumbers(int n) {

        int size = 1;

        for (int i = 1; i <= n; i++)
            size *= 10;

        size -= 1;

        int[] res = new int[size];

        for (int i = 0; i < size; i++) {
            res[i] = i + 1;
        }

        return res;
    }
}
