package queue.using.stacks;

import java.util.Stack;

// https://leetcode.com/problems/implement-queue-using-stacks/description/
class MyQueue { //FIFO

    private final Stack<Integer> pushStack = new Stack<>();
    private final Stack<Integer> popInverseStack = new Stack<>(); // LIFO

    public MyQueue() {

    }

    public void push(int x) {
        pushStack.push(x);
    }

    public int pop() {
        fillPopStack();
        return popInverseStack.pop();
    }

    private void fillPopStack() {
        if (popInverseStack.isEmpty()) { // this if is SUPER important
            while (!pushStack.isEmpty()) {
                popInverseStack.push(pushStack.pop());
            }
        }
    }

    public int peek() {
        fillPopStack();
        return popInverseStack.peek();
    }

    public boolean empty() {
        return pushStack.isEmpty() && popInverseStack.isEmpty();
    }
}
