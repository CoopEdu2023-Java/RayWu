class HashTable {
    // Define the structure of the hash table
    private class Node {
        String key;
        int value;
        Node next;

        public Node(String key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    // Define the hash table with an array of linked lists
    private Node[] table;
    private int size;
    private int capacity;

    public HashTable(int capacity) {
        this.capacity = capacity;
        table = new Node[capacity];
        size = 0;
    }

    // Hash function to map the key to an index
    private int hash(String key) {
        return Math.abs(key.hashCode() % capacity);
    }

    // Insert a key-value pair into the hash table
    public void insert(String key, int value) {
        int index = hash(key);
        if (table[index] == null) {
            table[index] = new Node(key, value);
            size++;
        } else {
            Node node = table[index];
            while (node.next != null) {
                if (node.key.equals(key)) {
                    node.value = value;
                    return;
                }
                node = node.next;
            }
            if (node.key.equals(key)) {
                node.value = value;
            } else {
                node.next = new Node(key, value);
                size++;
            }
        }
    }

    // Search for a key in the hash table
    public int search(String key) {
        int index = hash(key);
        Node node = table[index];
        while (node != null) {
            if (node.key.equals(key)) {
                return node.value;
            }
            node = node.next;
        }
        return -1; // Key not found
    }

    // Delete a key from the hash table
    public void delete(String key) {
        int index = hash(key);
        Node node = table[index];
        if (node == null) {
            return;
        }
        if (node.key.equals(key)) {
            table[index] = node.next;
            size--;
            return;
        }
        Node prev = node;
        node = node.next;
        while (node != null) {
            if (node.key.equals(key)) {
                prev.next = node.next;
                size--;
                return;
            }
            prev = node;
            node = node.next;
        }
    }

    // Display the contents of the hash table
    public void display() {
        for (int i = 0; i < capacity; i++) {
            Node node = table[i];
            while (node != null) {
                System.out.println("Index: " + i + ", Key: " + node.key + ", Value: " + node.value);
                node = node.next;
            }
        }
    }
}