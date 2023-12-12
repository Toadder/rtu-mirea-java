import java.awt.Dimension;

import javax.swing.JButton;

public class Button extends JButton {
	private String teamName;
	private int score = 0;

	public Button(String teamName){
		super(teamName);
		this.setPreferredSize(new Dimension(240, 50));
		this.teamName = teamName;
	}

	public String getTeamName() {
		return this.teamName;
	}

	public int getScore() {
		return this.score;
	}

	public void incrementScore() {
		this.score++;
	}

}
