package my.leetcode.twopointers;

import java.util.Arrays;

/**
 * https://leetcode.cn/problems/3sum-closest/
 * <p>
 * medium
 */
public class Q16 {

    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int close = nums[0] + nums[1] + nums[2];

        int sum;
        for (int i = 0; i < nums.length - 2; i++) {
            while (i < nums.length - 3 && nums[i] == nums[i + 1])
                i++;
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                sum = nums[i] + nums[j] + nums[k];

                if (Math.abs(target - close) > Math.abs(target - sum)) {
                    close = sum;
                }
                if (target - sum > 0) {
                    j++;
                } else if (target - sum < 0) {
                    k--;
                } else {
                    return target;
                }
            }
        }
        return close;
    }


    public static void main(String[] args) {
        Q16 q16 = new Q16();
        q16.threeSumClosest(new int[]{1, 1, 1, 0}, 100);
    }
}
