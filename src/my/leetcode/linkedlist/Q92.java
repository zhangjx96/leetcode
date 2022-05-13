package my.leetcode.linkedlist;

import my.leetcode.ListNode;

/**
 * https://leetcode.cn/problems/reverse-linked-list-ii/
 * <p>
 * medium
 */
public class Q92 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right)
            return head;
        ListNode phead = new ListNode(0, head), pre = phead, next = head;
        ListNode tmp;
        for (int i = 0; i < right - 1; i++) {
            if (i < left - 1) {
                pre = pre.next;
                next = next.next;
            } else {
                tmp = next.next;
                next.next = tmp.next;
                tmp.next = pre.next;
                pre.next = tmp;
            }
        }

        return phead.next;
    }

    public static void main(String[] args) {
        Q92 q92 = new Q92();
        q92.reverseBetween(ListNode.of(new int[]{1, 2, 3, 4, 5}), 2, 4);
    }
}
