package my.leetcode.lcof;


import my.leetcode.dfs.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/
 * <p>
 * medium
 */
public class Q32 {

    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[]{};
        }
        List<Integer> nums = new ArrayList<>();
        Queue<TreeNode> list = new LinkedList<>();

        list.offer(root);

        while (!list.isEmpty()) {
            TreeNode node = list.poll();
            nums.add(node.val);
            if (node.left != null) {
                list.offer(node.left);
            }
            if (node.right != null) {
                list.offer(node.right);
            }
        }
        return nums.stream().mapToInt(x -> x).toArray();
    }
}
