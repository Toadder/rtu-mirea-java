import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class DoubleListGame {
	private Scanner scanner = new Scanner(System.in);

	private LinkedList<Integer> firstPlayer = new LinkedList<>();
	private LinkedList<Integer> secondPlayer = new LinkedList<>();

	private String winner;
	private int moves = 0;

	public void init() {
		String[] data = (this.scanner.nextLine()).split(" ");

		this.processData(data);

		boolean isInverted = false;
		while (!this.firstPlayer.isEmpty() && !this.secondPlayer.isEmpty() && this.moves < 106) {
			int firstNumber = this.firstPlayer.pollFirst(),
					secondNumber = this.secondPlayer.pollFirst();

			if (Math.abs(firstNumber - secondNumber) == 9)
				isInverted = true;

			if (firstNumber > secondNumber)
				this.updateDequeue(isInverted ? this.secondPlayer : this.firstPlayer, firstNumber, secondNumber);
			else
				this.updateDequeue(isInverted ? this.firstPlayer : this.secondPlayer, firstNumber, secondNumber);

			this.moves++;
			isInverted = false;
		}

		this.winner = this.firstPlayer.isEmpty() ? "second" : "first";

		if (this.moves >= 106)
			this.winner = "Botva";

		System.out.println(this.winner + " " + this.moves);
	}

	private void processData(String[] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length(); j++) {
				char digit = data[i].charAt(j);
				int number = Character.getNumericValue(digit);

				if (i > 1)
					return;

				if (i == 0)
					this.firstPlayer.addLast(number);
				else
					this.secondPlayer.addLast(number);
			}
		}
	}

	private void updateDequeue(Deque<Integer> player, int firstCard, int secondCard) {
		player.addLast(firstCard);
		player.addLast(secondCard);
	}
}
