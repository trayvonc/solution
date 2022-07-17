package zhanduilie05;

import java.util.ArrayDeque;
import java.util.Deque;

class MyStack {
    Deque<Integer> deque1;
    Deque<Integer> deque2;

    public MyStack() {
        deque1=new ArrayDeque<>();
        deque2=new ArrayDeque<>();
    }

    public void push(int x) {
        deque1.addLast(x);

    }

    public int pop() {
        if(deque1.isEmpty()) return -1;
        while(deque1.size()!=1) deque2.addLast(deque1.pollFirst());
        int res=deque1.pollFirst();
        while(!deque2.isEmpty()) deque1.addLast(deque2.pollFirst());
        return res;
    }

    public int top() {
        if(deque1.isEmpty()) return -1;
        while(deque1.size()!=1) deque2.addLast(deque1.pollFirst());
        int res=deque1.peekFirst();
        deque2.addLast(deque1.pollFirst());
        while(!deque2.isEmpty()) deque1.addLast(deque2.pollFirst());
        return res;
    }

    public boolean empty() {
        return deque1.isEmpty();
    }
}
