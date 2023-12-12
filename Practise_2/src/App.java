import java.util.Arrays;
import java.util.Random;

public class App {

    public static void taskOne() {
        int[] array = { 17, 26, 37, -2, 0, 99 };
        int res = 0, j = 0;

        for (int i = 0; i < array.length; i++) {
            res += array[i];
        }
        System.out.println("FOR LOOP -> " + res);

        res = 0;
        while (j < array.length) {
            res += array[j];
            j++;
        }
        System.out.println("WHILE LOOP -> " + res);

        res = j = 0;
        do {
            res += array[j];
            j++;
        } while (j < array.length);
        System.out.println("DO WHILE LOOP -> " + res);
    }

    public static void taskTwo(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    public static void taskThree() {
        for (int i = 1; i < 11; i++) {
            System.out.println(1.0 / i);
        }
        System.out.println();
    }

    public static void taskFour() {
        int n = 5;
        int[] numbers = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++)
            numbers[i] = random.nextInt(100); // [0, 99]
        for (int i = 0; i < n; i++)
            System.out.print(numbers[i] + " ");

        System.out.println();

        Arrays.sort(numbers);
        for (int i = 0; i < n; i++)
            System.out.print(numbers[i] + " ");

        System.out.println();
    }

    public static void taskFive(int n) {
        int res = 1;

        for (int i = 1; i <= n; i++) {
            res *= i;
        }

        System.out.println(res);
    }

    public static void main(String[] args) {
        System.out.println("--- TASK 1 ---");
        App.taskOne();
        System.out.println();

        System.out.println("--- TASK 2 ---"); // java ./src/App.java var1 var2
        App.taskTwo(args);
        System.out.println();

        System.out.println("--- TASK 3 ---");
        App.taskThree();
        System.out.println();

        System.out.println("--- TASK 4 ---");
        App.taskFour();
        System.out.println();

        System.out.println("--- TASK 5 ---");
        App.taskFive(6);
        System.out.println();
    }

}
