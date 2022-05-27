package my.leetcode.lcof;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Optional;

/**
 * https://leetcode.cn/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 *
 * easy
 */
public class Q09 {


    class CQueue {

        Deque<Integer> stack1;

        Deque<Integer> stack2;

        public CQueue() {
            stack1 = new LinkedList<>();
            stack2 = new LinkedList<>();
        }

        public void appendTail(int value) {
            stack1.push(value);
        }

        public int deleteHead() {
            if (stack2.isEmpty())
                stack1ToStack2();
            return stack2.isEmpty() ? -1 : stack2.pop();
        }

        private void stack1ToStack2() {
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
        }
    }

}
