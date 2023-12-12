import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Frame extends JFrame {
	FlowLayout layout = new FlowLayout(50);

	Button milanButton = new Button("AC Milan");
	Button madridButton = new Button("Real Madrid");

	Label resultLabel = new Label("Result: ", "0 x 0");
	Label scorerLabel = new Label("Last Scorer: ", "N/A");
	Label winnerLabel = new Label("Winner: ", "DRAW");

	ButtonActionListener actionListener = new ButtonActionListener(milanButton, madridButton, resultLabel, scorerLabel, winnerLabel);

	public Frame() {
		super("Практическая работа №7");

		this.setSize(520, 200);
		this.setLocationRelativeTo(null);
		this.setResizable(false);

		this.setLayout(this.layout);
		layout.setHgap(10);
		layout.setVgap(20);

		this.add(milanButton);
		this.add(madridButton);

		this.milanButton.addActionListener(actionListener);
		this.madridButton.addActionListener(actionListener);

		this.add(resultLabel);
		this.add(scorerLabel);
		this.add(winnerLabel);

		this.setVisible(true);
	}

	public static void init() {
		new Frame();
	}

	

}
