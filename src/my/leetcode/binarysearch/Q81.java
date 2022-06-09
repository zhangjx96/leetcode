package my.leetcode.binarysearch;

/**
 * https://leetcode.cn/problems/search-in-rotated-sorted-array-ii/
 * <p>
 * medium
 * todo
 */
public class Q81 {

    public boolean search(int[] nums, int target) {
        int l = 0, r = nums.length - 1, mid;
        if (l == r)
            return nums[0] == target;

        while (l <= r) {
            mid = (l + r) / 2;
            if(nums[mid] == target)
                return true;
            if (nums[mid] < nums[l]) {
                //右有序


            }else {
                //左有序
            }
        }
        return false;
    }
}
