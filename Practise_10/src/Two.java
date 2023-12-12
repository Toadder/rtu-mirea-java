import java.util.Scanner;

public class Two {
	private static Scanner scanner = new Scanner(System.in);

	public static void solution(int number, int i) {
		if(i > number) return; // Base case
		System.out.print(i + " ");
		solution(number, i + 1); // Recursive case
	}

	public static void solution(int number) {
		solution(number, 1);
	}

	public static void main(String[] args) {
		int number = scanner.nextInt();
		solution(number);
	}	
}
