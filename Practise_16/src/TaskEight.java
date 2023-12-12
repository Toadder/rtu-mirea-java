import java.util.Scanner;

public class TaskEight {
	public void getKey() {
		Scanner myScanner = new Scanner(System.in);
		boolean isCorrect = false;

		do {
			isCorrect = false;
			System.out.print("Enter Key ");
			String key = myScanner.nextLine();

			try {
				this.printDetails(key);
			} catch (Exception e) {
				isCorrect = true;
			}
		} while (isCorrect);
	}

	public void printDetails(String key) throws Exception {
		String message = this.getDetails(key);
		System.out.println(message);
	}

	private String getDetails(String key) throws Exception {
		if (key == "") {
			throw new Exception("Key set to empty string");
		} else {
			return "data for " + key;
		}
	}
}
