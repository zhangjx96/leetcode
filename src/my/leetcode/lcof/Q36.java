package my.leetcode.lcof;

import my.leetcode.dfs.TreeNode;

import java.util.LinkedList;

/**
 * https://leetcode.cn/problems/er-cha-sou-suo-shu-yu-shuang-xiang-lian-biao-lcof/
 * <p>
 * medium
 * <p>
 */
public class Q36 {
    LinkedList<TreeNode> list = new LinkedList<>();

    public TreeNode treeToDoublyList(TreeNode root) {
        if (root == null)
            return null;
        dfs(root);
        for (int i = 0; i < list.size(); i++) {
            list.get(i).right = i == list.size() - 1 ? list.get(0) : list.get(i + 1);
            list.get(i).left = i == 0 ? list.get(list.size() - 1) : list.get(i - 1);
        }
        return list.get(0);
    }

    void dfs(TreeNode root) {
        if (root == null)
            return;
        dfs(root.left);
        list.add(root);
        dfs(root.right);
    }
}
