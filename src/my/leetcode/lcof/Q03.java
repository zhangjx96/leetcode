package my.leetcode.lcof;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.cn/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
 * <p>
 * easy
 */
public class Q03 {

    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet();

        int i = 0;

        while (i < nums.length) {
            if (!set.add(nums[i]))
                return nums[i];
            i++;
        }
        return -1;
    }
}
