import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ім'я файлу: ");
        String fileName = scanner.nextLine();

        try (FileInputStream fis = new FileInputStream(fileName)) {
            int byteValue;
            int offset = 0;

            while ((byteValue = fis.read()) != -1) {
                if (offset % 16 == 0) {
                    if (offset != 0) {
                        System.out.println();
                    }
                    System.out.printf("%08X: ", offset);
                }

                System.out.printf("%02X ", byteValue);
                offset++;
            }

            System.out.println();
            System.out.println("Файл успішно прочитано.");
        } catch (IOException e) {
            System.out.println("Помилка при роботі з файлом:");
            e.printStackTrace();
        } finally {
            System.out.println("Робота програми завершена.");
            scanner.close();
        }
    }
}
