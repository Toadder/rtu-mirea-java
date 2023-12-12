import java.awt.Dimension;

import javax.swing.JLabel;

public class Label extends JLabel {
	private String prefix;

	public Label(String prefix, String text) {
		super(prefix + text);
		this.prefix = prefix;
		this.setPreferredSize(new Dimension(150, 50));
		this.setHorizontalAlignment(JLabel.CENTER);
	}
	
	public void updateText(String text) {
		this.setText(prefix + text);
	}

}
