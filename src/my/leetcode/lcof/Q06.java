package my.leetcode.lcof;

import my.leetcode.ListNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * https://leetcode.cn/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 *
 * easy
 */
public class Q06 {

    public int[] reversePrint(ListNode head) {
        Deque<Integer> stack = new LinkedList<>();

        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        int[] nums = new int[stack.size()];
        int i = 0;
        while (!stack.isEmpty()) {
            nums[i++] = stack.pop();
        }
        return nums;
    }
}
