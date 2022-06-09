package my.leetcode.lcof;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.cn/problems/zi-fu-chuan-de-pai-lie-lcof/
 * <p>
 * medium
 * todo
 */
public class Q38 {

    Set<String> res = new HashSet<>();
    char[] c;

    public String[] permutation(String s) {
        c = s.toCharArray();

        dfs(new StringBuilder(), new boolean[c.length]);
        return res.toArray(new String[0]);
    }

    private void dfs(StringBuilder sb, boolean[] flag) {
        if (sb.length() == c.length)
            res.add(sb.toString());
        for (int i = 0; i < c.length; i++) {
            if (flag[i])
                continue;
            sb.append(c[i]);
            flag[i] = true;
            dfs(sb, flag);
            flag[i] = false;
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
