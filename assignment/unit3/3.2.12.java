class CheckMinHeap {
    public static boolean isMinHeap(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int leftChildIndex = 2 * i + 1;
            int rightChildIndex = 2 * i + 2;

            if (leftChildIndex < n && array[i] > array[leftChildIndex]) {
                return false;
            }

            if (rightChildIndex < n && array[i] > array[rightChildIndex]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array1 = {4, 2, 3, 1, 5};
        System.out.println(isMinHeap(array1)); // prints true

        int[] array2 = {4, 10, 3, 1, 5};
        System.out.println(isMinHeap(array2)); // prints false
    }
}