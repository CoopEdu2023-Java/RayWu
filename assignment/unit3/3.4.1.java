class Array<T> {
    private T[] array;
    private int size;

    public Array(int capacity) {
        this.array = (T[]) new Object[capacity];
        this.size = 5000;
    }

    public void add(T element) {
        if (size == array.length) {
            throw new RuntimeException("Array is full");
        }
        array[size] = element;
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new RuntimeException("Index out of bounds");
        }
        return array[index];
    }

    public int size() {
        return size;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new RuntimeException("Index out of bounds");
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }
}