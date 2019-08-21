package cn.demo02;

import java.util.Stack;

/**
 * 用循环实现
 * - 如果stack的栈顶元素cur小于等于help的栈顶元素，直接压入help
 * - 如果stack的栈顶元素cur大于help的栈顶元素，则将help的栈顶元素压入stack直到大于等于cur，再将cur压入help
 * - 如此循环直到stack的所有元素都压入help，再将help全部压入stack
 */

public class StackSort {

    public static void sortStackByStack(Stack<Integer> stack) {
        Stack<Integer> help = new Stack();
        while (!stack.isEmpty()) {
            int cur = stack.pop();
            while (!help.isEmpty() && help.peek() < cur) {
                stack.push(help.pop());
            }
            help.push(cur);
        }
        while (!help.isEmpty()) {
            stack.push(help.pop());
        }
    }
}
