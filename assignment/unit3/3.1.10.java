class LinkedStack {
    private Node top;
    private int size;

    public LinkedStack() {
        top = null;
        size = 0;
    }

    // Node class representing each element in the stack
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Push operation: adds an element to the top of the stack
    public void push(int value) {
        Node newNode = new Node(value);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        size++;
    }

    // Pop operation: removes an element from the top of the stack
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty. Cannot pop");
            return -1;
        } else {
            int value = top.data;
            top = top.next;
            size--;
            return value;
        }
    }

    // Peek operation: returns the top element of the stack without removing it
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty. Cannot peek");
            return -1;
        } else {
            return top.data;
        }
    }

    // isEmpty operation: checks if the stack is empty
    public boolean isEmpty() {
        return (top == null);
    }

    // size operation: returns the number of elements in the stack
    public int size() {
        return size;
    }

    // printStack operation: prints the elements of the stack
    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}