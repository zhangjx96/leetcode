package my.leetcode.linkedlist;

import my.leetcode.ListNode;

/**
 * https://leetcode.cn/problems/partition-list/
 * <p>
 * medium
 */
public class Q86 {

    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null)
            return head;

        ListNode tail = head;
        int i = 0;
        while (tail.next != null) {
            tail = tail.next;
            i++;
        }
        ListNode cur = head;
        ListNode pre = new ListNode(-200, head), hhead = pre;

        for (int j = 0; j <= i; j++) {
            if (cur.val >= x && cur != tail) {
                pre.next = cur.next;
                cur.next = null;
                tail.next = cur;
                tail = tail.next;
                cur = pre.next;
            } else {
                pre = pre.next;
                cur = cur.next;
            }
        }

        return hhead.next;

    }

    public static void main(String[] args) {
        Q86 q86 = new Q86();
        q86.partition(ListNode.of(new int[]{1, 2}), 2);
    }
}
