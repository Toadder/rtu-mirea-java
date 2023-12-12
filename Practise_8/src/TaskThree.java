import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

class MainFrame extends JFrame {
	private JLabel imgLabel;
	private int imgQty = 3;
	private int imgNumber = 1;

	public MainFrame() {
		this.setSize(400, 400);
		this.imgLabel = new JLabel("", new ImageIcon(this.getClass().getResource("1.jpg")), 0);
		this.getContentPane().add(this.imgLabel);
		Timer timer = new Timer(250, (e) -> this.nextImg());
		timer.start();
	}

	private void nextImg() {
		this.imgNumber = this.imgNumber % this.imgQty + 1;
		this.imgLabel.setIcon(new ImageIcon(this.getClass().getResource((this.imgNumber) + ".jpg")));
	}
}

public class TaskThree {
	public static void init() {
		MainFrame mainFrame = new MainFrame();
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
	}
}
