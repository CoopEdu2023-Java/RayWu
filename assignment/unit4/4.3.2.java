import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadExample {
    public static void main(String[] args) {
        int maxThreads = 10;
        int taskSize = 10000000;

        for (int i = 1; i <= maxThreads; i++) {
            ExecutorService executorService = Executors.newFixedThreadPool(i);
            long startTime = System.currentTimeMillis();

            for (int j = 0; j < i; j++) {
                int finalI = i;
                executorService.submit(() -> {
                    for (int k = 0; k < taskSize / finalI; k++) {
                        // Simulate some work
                    }
                });
            }

            executorService.shutdown();
            while (!executorService.isTerminated()) {
                // Wait for all tasks to finish
            }

            long endTime = System.currentTimeMillis();
            System.out.println("Number of threads: " + i + ", Time taken: " + (endTime - startTime) + "ms");
        }
    }
}