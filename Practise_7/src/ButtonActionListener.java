import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonActionListener implements ActionListener {
	Button milanButton, madridButton;
	Label resultLabel, scorerLabel, winnerLabel;

	public ButtonActionListener(Button milanButton, Button madridButton, Label resultLabel, Label scorerLabel,
			Label winnerLabel) {
		super();
		this.milanButton = milanButton;
		this.madridButton = madridButton;
		this.resultLabel = resultLabel;
		this.scorerLabel = scorerLabel;
		this.winnerLabel = winnerLabel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		Button currentButton = (Button) source;

		currentButton.incrementScore();

		int milanScore = milanButton.getScore();
		int madridScore = madridButton.getScore();
		String winner = milanScore > madridScore ? milanButton.getTeamName() : madridButton.getTeamName();

		resultLabel.updateText(milanScore + " x " + madridScore);
		scorerLabel.updateText(currentButton.getTeamName());
		winnerLabel.updateText(milanScore == madridScore ? "DRAW" : winner);
	}

}
