import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MyException1 extends Exception {
    public MyException1(String message) {
        super(message);
    }
}

class MyException2 extends Exception {
    public MyException2(String message) {
        super(message);
    }
}

class MyException3 extends Exception {
    public MyException3(String message, Throwable cause) {
        super(message, cause);
    }
}

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Виберіть варіант (1 або 2): ");
        int choice = scanner.nextInt();

        List<Throwable> caughtExceptions = new ArrayList<>();

        try {
            if (choice == 1) {
                throw new MyException1("Викинуто MyException1");
            } else if (choice == 2) {
                throw new MyException2("Викинуто MyException2");
            } else {
                throw new IllegalArgumentException("Неправильний вибір");
            }
        } catch (MyException1 | MyException2 e) {
            caughtExceptions.add(e);

            try {
                throw new MyException3("Третій виняток після обробки першого/другого", e);
            } catch (MyException3 ex) {
                caughtExceptions.add(ex);

                System.out.println("Стек викликів для кожного перехопленого винятку:");
                for (Throwable t : caughtExceptions) {
                    System.out.println("----- " + t.getClass().getSimpleName() + " -----");
                    t.printStackTrace(System.out);
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Некоректний ввод: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
