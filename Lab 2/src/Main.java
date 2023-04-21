import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввести текст
        System.out.print("Введіть текст: ");
        String text = scanner.nextLine();

        // Ввести короткий рядок
        System.out.print("Введіть короткий рядок: ");
        String shortString = scanner.nextLine();

        // Ввести число k
        System.out.print("Введіть число k: ");
        int k = scanner.nextInt();

        Text manipulator = new Text(text, shortString, k);
        manipulator.processText();

    }
}
