import java.util.Scanner;

public class One {
	private static Scanner scanner = new Scanner(System.in);

	public static void recursion(int n, int i) {
		if (i == n)
			return; // Base case
		System.out.print(n + " ");
		recursion(n, i + 1); // Recursive case
	}

	public static void recursion(int n) {
		recursion(n, 0);
	}

	public static void solution(int number) {
		for (int i = 1; i <= number; i++)
			recursion(i);
	}

	public static void main(String[] args) {
		int number = scanner.nextInt();
		solution(number);
	}
}
