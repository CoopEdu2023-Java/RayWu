class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListDemo<T> {
    private Node<T> head;
    private int size;

    public LinkedListDemo() {
        this.head = null;
        this.size = 0;
    }
}