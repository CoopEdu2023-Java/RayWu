import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    private Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.poll();
    }

    public int top() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}