package my.leetcode.linkedlist;

import my.leetcode.ListNode;

/**
 * https://leetcode.cn/problems/remove-duplicates-from-sorted-list/
 *
 * easy
 */
public class Q83 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            while (cur.next != null && cur.val == cur.next.val) {
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        return head;
    }

}
