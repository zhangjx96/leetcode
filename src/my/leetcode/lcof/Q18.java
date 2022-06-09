package my.leetcode.lcof;


import my.leetcode.ListNode;

/**
 * https://leetcode.cn/problems/shan-chu-lian-biao-de-jie-dian-lcof/
 * <p>
 * easy
 * <p>
 */
public class Q18 {

    public ListNode deleteNode(ListNode head, int val) {

        ListNode c = new ListNode(-1, head);
        head = c;
        while (c != null && c.next != null) {
            if (c.next.val == val) {
                c.next = c.next.next;
            }
            c = c.next;
        }
        return head.next;
    }
}
