package zhanduilie05;

import java.util.Stack;

class MyQueue {
    Stack<Integer> stackIn;
    Stack<Integer> stackOut;

    public MyQueue() {
        stackIn=new Stack<>();
        stackOut=new Stack<>();
    }

    public void push(int x) {
        stackIn.push(x);
    }

    public int pop() {
        if(!stackOut.isEmpty()) return stackOut.pop();
        while(!stackIn.empty()) {
            stackOut.push(stackIn.pop());
        }
        return stackOut.pop();

    }

    public int peek() {
        if(!stackOut.isEmpty()) return stackOut.peek();
        while(!stackIn.empty()) {
            stackOut.push(stackIn.pop());
        }
       return stackOut.peek();

    }

    public boolean empty() {
        return stackOut.isEmpty()&&stackIn.isEmpty();

    }
}
