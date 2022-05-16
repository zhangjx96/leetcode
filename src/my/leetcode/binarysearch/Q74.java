package my.leetcode.binarysearch;

/**
 * https://leetcode.cn/problems/search-a-2d-matrix/
 * <p>
 * medium
 * <p>
 */
public class Q74 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int i = matrix.length, j = matrix[0].length;
        int l = 0, r = i * j - 1;
        int[] mid;

        while (l <= r) {
            mid = findMid(j, l, r);
            if (matrix[mid[0]][mid[1]] > target) {
                r = findIndex(j, mid[0], mid[1]) - 1;
            } else if (matrix[mid[0]][mid[1]] < target) {
                l = findIndex(j, mid[0], mid[1]) + 1;
            } else
                return true;

        }
        return false;
    }


    int[] findMid(int length, int left, int right) {
        int mid = (left + right) / 2;
        return new int[]{mid / length, mid % length};
    }

    int findIndex(int length, int x, int y) {
        return x * length + y;
    }
}
