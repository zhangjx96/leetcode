package my.leetcode.lcof;

import java.util.Deque;
import java.util.LinkedList;

/**
 * https://leetcode.cn/problems/zhan-de-ya-ru-dan-chu-xu-lie-lcof/
 * <p>
 * medium
 */
public class Q31 {

    public boolean validateStackSequences(int[] pushed, int[] popped) {

        Deque<Integer> stack = new LinkedList<>();

        int i = 0, j = 0;

        while (j < popped.length) {
            while (i < pushed.length && (stack.isEmpty() || stack.peek() != popped[j]))
                stack.push(pushed[i++]);
            if (stack.isEmpty() || stack.peek() != popped[i]) {
                return false;
            }
            j++;
            stack.pop();
        }
        return true;
    }
}
