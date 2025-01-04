import java.util.Arrays;

class SleepSort {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9};
        sort(numbers);
    }

    public static void sort(int[] numbers) {
        Thread[] threads = new Thread[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            final int num = numbers[i];
            threads[i] = new Thread(() -> {
                try {
                    Thread.sleep(num * 100); // sleep for num * 100 milliseconds
                    System.out.println(num);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}