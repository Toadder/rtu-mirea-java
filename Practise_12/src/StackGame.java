import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class StackGame {
	private Scanner scanner = new Scanner(System.in);

	private Stack<Integer> firstPlayer = new Stack<>();
	private Stack<Integer> secondPlayer = new Stack<>();

	private String winner;
	private int moves = 0;

	public void init() {
		String[] data = (this.scanner.nextLine()).split(" ");

		this.processData(data);

		boolean isInverted = false;
		while (!this.firstPlayer.isEmpty() && !this.secondPlayer.isEmpty() && this.moves < 106) {
			int firstNumber = this.firstPlayer.pop(),
					secondNumber = this.secondPlayer.pop();

			if (Math.abs(firstNumber - secondNumber) == 9)
				isInverted = true;

			if (firstNumber > secondNumber)
				this.updateStack(isInverted ? this.secondPlayer : this.firstPlayer, firstNumber, secondNumber);
			else
				this.updateStack(isInverted ? this.firstPlayer : this.secondPlayer, firstNumber, secondNumber);

			this.moves++;
			isInverted = false;
		}

		this.winner = this.firstPlayer.isEmpty() ? "second" : "first";

		if(this.moves >= 106)
			this.winner = "Botva";

		System.out.println(this.winner + " " + this.moves);
	}

	private void processData(String[] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = data[i].length() - 1; j >= 0; j--) {
				char digit = data[i].charAt(j);
				int number = Character.getNumericValue(digit);

				if (i > 1)
					return;

				if (i == 0)
					this.firstPlayer.add(number);
				else
					this.secondPlayer.add(number);
			}
		}
	}

	private void updateStack(Stack<Integer> player, int firstCard, int secondCard) {
		List<Integer> cards = new ArrayList<Integer>();
		
		while(!player.isEmpty()) {
			int card = player.pop();
			cards.add(0, card);
		}

		player.push(secondCard);
		player.push(firstCard);

		for(int card: cards)
			player.push(card);
	}
}
