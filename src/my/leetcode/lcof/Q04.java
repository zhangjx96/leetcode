package my.leetcode.lcof;

/**
 * https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/
 *
 * medium
 */
public class Q04 {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length==0)
            return false;
        int n = matrix.length, m = matrix[0].length;

        int i = n-1,j = 0;

        while(i>=0&&j<m){
            if(matrix[i][j]==target)
                return true;
            else if(matrix[i][j]>target)
                i--;
            else if(matrix[i][j]<target)
                j++;
        }
        return false;
    }
}
