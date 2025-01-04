import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class LambdaThreadExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(() -> {
            for (int i = 0; i <= 100; i += 2) {
                System.out.println(i);
            }
        });

        executorService.submit(() -> {
            for (int i = 1; i <= 100; i += 2) {
                System.out.println(i);
            }
        });

        executorService.shutdown();
    }
}