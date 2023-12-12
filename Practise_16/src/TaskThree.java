import java.util.Scanner;

public class TaskThree {
	public void stepOne() {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Enter an integer ");

		try {
			String intString = myScanner.next();

			int i = Integer.parseInt(intString); // NumberFormatException, невозможно преобразовать в строку
			System.out.println(2 / i); // ArithmeticException, если ввести 0
		} catch (Exception e) {
			System.out.println("Error");
			System.err.println(e.getMessage());
		}
	}
}
