class LinearQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queueArray;

    public LinearQueue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
    }

    // Enqueue operation: adds an element to the end of the queue
    public void enqueue(int value) {
        if (rear == maxSize - 1) {
            System.out.println("Queue is full. Cannot enqueue " + value);
        } else {
            queueArray[++rear] = value;
        }
    }

    // Dequeue operation: removes an element from the front of the queue
    public int dequeue() {
        if (front > rear) {
            System.out.println("Queue is empty. Cannot dequeue");
            return -1;
        } else {
            return queueArray[front++];
        }
    }

    // isEmpty operation: checks if the queue is empty
    public boolean isEmpty() {
        return (front > rear);
    }

    // isFull operation: checks if the queue is full
    public boolean isFull() {
        return (rear == maxSize - 1);
    }

    // size operation: returns the number of elements in the queue
    public int size() {
        return rear - front + 1;
    }

    // printQueue operation: prints the elements of the queue
    public void printQueue() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(queueArray[i] + " ");
            }
            System.out.println();
        }
    }
}