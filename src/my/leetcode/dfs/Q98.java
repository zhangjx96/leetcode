package my.leetcode.dfs;

import java.util.ArrayList;
import java.util.List;

public class Q98 {
    List<Integer> list = new ArrayList<>();

    public boolean isValidBST(TreeNode root) {
        bfs(root);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1))
                return false;
        }
        return true;
    }

    public void bfs(TreeNode root) {
        if (root.left != null)
            bfs(root.left);
        list.add(root.val);
        if (root.right != null)
            bfs(root.right);
    }
}
