import java.lang.reflect.*;
import java.net.URL;
import java.net.URLClassLoader;

class cracker {
    public static void main(String[] args) throws Exception {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        Class<?> mainClass = systemClassLoader.loadClass("GuessingGame");
        Object instance = mainClass.getDeclaredConstructor().newInstance();
        Method mainMethod = mainClass.getMethod("main", String[].class);

        new Thread(() -> {
            try {
                mainMethod.invoke(instance, (Object) new String[] {});
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(100);
                Field field = instance.getClass().getDeclaredField("secretNumber");
                field.setAccessible(true);
                System.out.println("Cracked: " + field.get(mainMethod));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }}).start();

    }
}
