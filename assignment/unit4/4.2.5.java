import java.io.FileInputStream;
import java.io.IOException;

class InputStreamExample {
    public static void main(String[] args) {
        String filePath = "example.txt";

        try (FileInputStream inputStream = new FileInputStream(filePath)) {
            int byteValue;
            while ((byteValue = inputStream.read()) != -1) {
                System.out.print((char) byteValue);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}