import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

class BufferedInputStreamExample {
    public static void main(String[] args) {
        String filePath = "example.txt";

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath))) {
            int byteValue;
            while ((byteValue = bufferedInputStream.read()) != -1) {
                System.out.print((char) byteValue);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}