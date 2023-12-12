import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;

        System.out.println("--- TASK ONE ---");

        System.out.print("Введите текст: ");
        text = scanner.nextLine();

        TaskOne.init(text);
        System.out.println("Текст успешно записан.");
        System.out.println();

        System.out.println("--- TASK TWO ---");
        TaskTwo.init();
        System.out.println();

        System.out.println("--- TASK THREE ---");

        System.out.print("Введите текст: ");
        text = scanner.nextLine();

        TaskThree.init(text);
    }
}
