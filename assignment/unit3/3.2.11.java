class Heap<T extends Comparable<T>> {
    private T[] heap;
    private int size;
    private boolean isMaxHeap;

    public Heap(int capacity, boolean isMaxHeap) {
        this.heap = (T[]) new Object[capacity];
        this.size = 0;
        this.isMaxHeap = isMaxHeap;
    }

    // Get the index of the parent node
    private int getParent(int index) {
        return (index - 1) / 2;
    }

    // Get the index of the left child node
    private int getLeftChild(int index) {
        return 2 * index + 1;
    }

    // Get the index of the right child node
    private int getRightChild(int index) {
        return 2 * index + 2;
    }

    // Swap two elements in the heap
    private void swap(int index1, int index2) {
        T temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }

    // Heapify up
    private void heapifyUp(int index) {
        if (index > 0) {
            int parentIndex = getParent(index);
            if ((isMaxHeap && heap[index].compareTo(heap[parentIndex]) > 0) ||
                    (!isMaxHeap && heap[index].compareTo(heap[parentIndex]) < 0)) {
                swap(index, parentIndex);
                heapifyUp(parentIndex);
            }
        }
    }

    // Heapify down
    private void heapifyDown(int index) {
        int leftChildIndex = getLeftChild(index);
        int rightChildIndex = getRightChild(index);
        int largest = index;

        if (leftChildIndex < size && ((isMaxHeap && heap[leftChildIndex].compareTo(heap[largest]) > 0) ||
                (!isMaxHeap && heap[leftChildIndex].compareTo(heap[largest]) < 0))) {
            largest = leftChildIndex;
        }

        if (rightChildIndex < size && ((isMaxHeap && heap[rightChildIndex].compareTo(heap[largest]) > 0) ||
                (!isMaxHeap && heap[rightChildIndex].compareTo(heap[largest]) < 0))) {
            largest = rightChildIndex;
        }

        if (largest != index) {
            swap(index, largest);
            heapifyDown(largest);
        }
    }

    // Insert an element into the heap
    public void insert(T element) {
        if (size == heap.length) {
            throw new RuntimeException("Heap is full");
        }
        heap[size] = element;
        size++;
        heapifyUp(size - 1);
    }

    // Remove the root element from the heap
    public T remove() {
        if (size == 0) {
            throw new RuntimeException("Heap is empty");
        }
        T root = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return root;
    }

    // Get the root element of the heap
    public T getRoot() {
        if (size == 0) {
            throw new RuntimeException("Heap is empty");
        }
        return heap[0];
    }
}