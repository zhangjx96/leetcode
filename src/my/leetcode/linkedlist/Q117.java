package my.leetcode.linkedlist;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * https://leetcode.cn/problems/populating-next-right-pointers-in-each-node-ii/
 * <p>
 * medium
 */
public class Q117 {

    //Method.1 广度优先
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Queue<Node> queue = new ArrayDeque<>();

        queue.offer(root);
        while (!queue.isEmpty()) {

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                node.next = i == size - 1 ? null : queue.peek();
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
        }

        return root;
    }


    //Method.2 深度优先遍历 root->right->left
    public Node connectM2(Node root) {
        if (root == null)
            return null;
        if (root.left != null) {
            if (root.right != null)
                root.left.next = root.right;
            else if (root.next != null) {
                Node next = nextValidNode(root);
                if (next != null)
                    root.left.next = next.left == null ? next.right : next.left;

            }
        }
        if (root.right != null) {
            if (root.next != null) {
                Node next = nextValidNode(root);
                if (next != null)
                    root.right.next = next.left == null ? next.right : next.left;
            }
        }
        connectM2(root.left);
        connectM2(root.right);
        return root;
    }

    public Node nextValidNode(Node node) {
        while (node.next != null && node.next.left == null && node.next.right == null) {
            node = node.next;
        }
        return node.next;
    }

    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }


    public static void main(String[] args) {

        Q117 q117 = new Q117();

        q117.connectM2(new Node(2,
                new Node(1, new Node(0, new Node(2), null, null), new Node(7, new Node(1), new Node(0, new Node(7), null, null), null), null), new Node(3, new Node(9), new Node(1, new Node(8), new Node(8), null), null), null));
    }
}
