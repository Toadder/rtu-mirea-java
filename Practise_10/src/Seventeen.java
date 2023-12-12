import java.util.Scanner;

public class Seventeen {
	private static Scanner scanner = new Scanner(System.in);

	public static int solution() {
		int number = scanner.nextInt();
		if(number == 0) return 0; // Base case
		return Math.max(number, solution()); // Recursive case
	}

	public static void main(String[] args) {
		int max = solution();
		System.out.println(max);
	}
}