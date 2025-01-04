import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

class BufferSizeTest {
    public static void main(String[] args) {
        String filePath = "large_file.txt";
        int[] bufferSizes = {1024, 10 * 1024, 8 * 1024 * 1024};

        for (int bufferSize : bufferSizes) {
            long startTime = System.currentTimeMillis();
            try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath), bufferSize)) {
                int byteValue;
                while ((byteValue = bufferedInputStream.read()) != -1) {

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            long endTime = System.currentTimeMillis();
            System.out.println("Buffer size: " + bufferSize + ", Time cost: " + (endTime - startTime) + "ms");
        }
    }
}