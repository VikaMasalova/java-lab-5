import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Використання: java Task3 <вхідний_файл> <вихідний_файл>");
            return;
        }

        String sourceFile = args[0];
        String destinationFile = args[1];

        try (FileInputStream in = new FileInputStream(sourceFile);
             FileOutputStream out = new FileOutputStream(destinationFile)) {

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }

            System.out.println("Файл успішно скопійовано з " + sourceFile + " в " + destinationFile);

        } catch (IOException e) {
            System.out.println("Помилка вводу/виводу:");
            e.printStackTrace();
        }
    }
}
