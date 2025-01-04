class LinearStack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public LinearStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top >= maxSize - 1) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
        }
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack is empty. Cannot pop");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Stack is empty. Cannot peek");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public int size() {
        return top + 1;
    }

    public void printStack() {
        if (top < 0) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }
}