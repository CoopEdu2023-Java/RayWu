class TreeFind {
    public static void bubbleSort(int[] arr) {
        // Get the length of the array
        int n = arr.length;

        // Repeat the process n-1 times
        for (int i = 0; i < n - 1; i++) {
            // Compare each pair of adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                // If the current element is greater than the next element, swap them
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j]; // Store the current element in a temporary variable
                    arr[j] = arr[j + 1]; // Move the next element to the current position
                    arr[j + 1] = temp; // Move the current element to the next position
                }
            }
        }
    }
}