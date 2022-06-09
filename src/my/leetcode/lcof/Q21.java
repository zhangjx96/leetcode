package my.leetcode.lcof;


/**
 * https://leetcode.cn/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/
 * <p>
 * easy
 */
public class Q21 {

    public int[] exchange(int[] nums) {
        int l = 0, r = nums.length - 1;

        while (l < r) {
            while (l < nums.length && nums[l] % 2 == 1) {
                l++;
            }
            while (r > 0 && nums[r] % 2 == 0) {
                r--;
            }
            if (l >= r)
                break;

            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
        }

        return nums;
    }
}
