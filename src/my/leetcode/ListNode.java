package my.leetcode;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    static ListNode of(int[] nums, int i) {
        ListNode node = new ListNode();
        ListNode next;
        if (nums.length - 1 > i) {
            next = of(nums, i + 1);
            node.next = next;
        }
        node.val = nums[i];
        return node;
    }

    public static ListNode of(int[] nums) {
        return ListNode.of(nums, 0);
    }
}
