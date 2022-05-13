package my.leetcode.binarysearch;

/**
 * https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/
 *
 * medium
 */
public class Q34 {

    int[] result = new int[]{-1, -1};

    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid;

        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                result[0] = mid;
                right = mid - 1;
            }
        }

        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                result[1] = mid;
                left = mid + 1;
            }
        }
        return result;
    }
}
