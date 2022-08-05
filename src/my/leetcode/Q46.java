package my.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.cn/problems/permutations/
 */
public class Q46 {

    List<List<Integer>> res1 = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        dfs(nums, 0, used, new ArrayList<>());
        return res1;
    }

    private void dfs(int[] nums, int length, boolean[] used, List<Integer> ans) {
        if (length == nums.length) {
            res1.add(new ArrayList<>(ans));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                ans.add(nums[i]);
                dfs(nums, length+1, used, ans);
                used[i] = false;
                ans.remove(ans.size() - 1);
            }
        }
    }
}
