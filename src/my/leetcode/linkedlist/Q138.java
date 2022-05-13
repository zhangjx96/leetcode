package my.leetcode.linkedlist;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.cn/problems/copy-list-with-random-pointer/
 *
 * medium
 */
public class Q138 {

    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();

        Node cur = head;
        Node copy = new Node(0), copyHead = copy;
        while (cur != null) {
            Node next = new Node(cur.val);
            copy.next = next;

            map.put(cur, next);
            cur = cur.next;
            copy = copy.next;
        }
        cur = head;
        copy = copyHead.next;
        while (cur != null) {
            if (cur.random != null) {
                copy.random = map.get(cur.random);
            }
            cur = cur.next;
            copy = copy.next;
        }
        return copyHead.next;
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
