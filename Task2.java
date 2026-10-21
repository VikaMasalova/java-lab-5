import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть рядок: ");
        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isDigit(ch)) {
                System.out.println("Позиція " + i + ": '" + ch + "' — цифра");
            } else if (Character.isUpperCase(ch)) {
                System.out.println("Позиція " + i + ": '" + ch + "' — велика літера");
            } else if (Character.isLowerCase(ch)) {
                System.out.println("Позиція " + i + ": '" + ch + "' — мала літера");
            } else if (Character.isWhitespace(ch)) {
                System.out.println("Позиція " + i + ": '" + ch + "' — пропуск");
            } else {
                System.out.println("Позиція " + i + ": '" + ch + "' — інший символ");
            }
        }

        scanner.close();
    }
}
