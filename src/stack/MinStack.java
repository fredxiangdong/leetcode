package stack;

import java.util.Stack;

/**
 * Created by yangxiangdong on 2024/3/23.
 */
public class MinStack {

    Stack<Integer> minstack;
    Stack<Integer> stack;

    public MinStack() {
        minstack = new Stack();
        stack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        minstack.push(minstack.size() == 0 ? val : Math.min(minstack.peek(),val));
    }

    public void pop() {
        stack.pop();
        minstack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minstack.peek();
    }

}
