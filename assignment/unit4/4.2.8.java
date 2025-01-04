import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class BufferedOutputStreamExample {
    public static void main(String[] args) {
        String content = "Hello, world!";
        String filePath = "example.txt";

        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(filePath))) {
            bufferedOutputStream.write(content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}