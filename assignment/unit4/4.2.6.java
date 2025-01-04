import java.io.FileOutputStream;
import java.io.IOException;

class OutputStreamExample {
    public static void main(String[] args) {
        String content = "Hello, world!";
        String filePath = "example.txt";

        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            outputStream.write(content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


