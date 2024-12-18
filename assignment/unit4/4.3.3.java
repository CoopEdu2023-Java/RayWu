import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SleepSort {
    public static void main(String[] args) throws InterruptedException{
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 7));
        numbers = sort(numbers);
        System.out.println(numbers);

    }
    public static List<Integer> sort(List<Integer> array) throws InterruptedException {
        List<Integer> array2 = new ArrayList<>();
        List<Thread> threads = new ArrayList<>();
        for(int i : array) {
            Thread t = new Thread(() -> {
                try {
                    Thread.sleep(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                array2.add(array.get(i));
            });
            t.start();
            threads.add(t);
        }
        for (Thread t : threads) {
            t.join();
        }
        return array2;
    }

}

