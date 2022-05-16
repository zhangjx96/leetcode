package my.leetcode.binarysearch;

/**
 * https://leetcode-cn.com/problems/search-in-rotated-sorted-array/
 * <p>
 * medium
 */
public class Q33 {


    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        if (left == right)
            return nums[left] == target ? left : -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[left] > nums[mid]) {
                if (target < nums[mid]) {
                    right = mid - 1;
                } else if (target >= nums[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > nums[mid]) {
                    left = mid + 1;
                } else if (target >= nums[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Q33 q33 = new Q33();
//        q33.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3);
        q33.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);

    }
}
