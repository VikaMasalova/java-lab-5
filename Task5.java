import java.io.Closeable;
import java.io.IOException;

class MyResource implements Closeable {
    private final String name;

    public MyResource(String name) {
        this.name = name;
        System.out.println("Створено ресурс: " + name);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Закрито ресурс: " + name);
    }
}

public class Task5 {
    public static void main(String[] args) {
        try (MyResource resource = new MyResource("DemoResource")) {
            System.out.println("Робота з ресурсом у блоці try-with-resources");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
