class LinkedQueue {
    private Node front;
    private Node rear;
    private int size;

    public LinkedQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    // Node class representing each element in the queue
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Enqueue operation: adds an element to the end of the queue
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // Dequeue operation: removes an element from the front of the queue
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty. Cannot dequeue");
            return -1;
        } else {
            int value = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            size--;
            return value;
        }
    }

    // isEmpty operation: checks if the queue is empty
    public boolean isEmpty() {
        return (front == null);
    }

    // size operation: returns the number of elements in the queue
    public int size() {
        return size;
    }

    // printQueue operation: prints the elements of the queue
    public void printQueue() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}