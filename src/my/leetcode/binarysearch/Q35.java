package my.leetcode.binarysearch;

/**
 * https://leetcode.cn/problems/search-insert-position/
 * <p>
 * easy
 */
public class Q35 {

    public int searchInsert(int[] nums, int target) {
        int index = nums.length;

        int l = 0, r = nums.length - 1, mid;
        while (l <= r) {
            mid = (l + r) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else if (nums[mid] > target) {
                index = Math.min(index, mid);
                r = mid - 1;
            } else
                return mid;
        }
        return index;
    }
}
