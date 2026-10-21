import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть кілька слів. Для завершення введіть порожній рядок:");
        StringBuilder sb = new StringBuilder();

        while (true) {
            String word = scanner.nextLine();

            if (word.isEmpty()) {
                break;
            }

            if (sb.length() > 0) {
                sb.append(" ");
            }

            sb.append(word);
            System.out.println("Поточна ємність StringBuilder: " + sb.capacity());
        }

        System.out.println("Підсумкове значення: " + sb.toString());
        scanner.close();
    }
}
