import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Image extends JPanel {
	private BufferedImage image;

	Image(BufferedImage image) {
		this.image = image;
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(this.image, 0, 0, null);
	}
}

public class TaskTwo {

	public static void init(String[] args) {
		if (args.length != 1) {
			System.out.println("Image path not found.");
			return;
		}

		String imagePath = args[0];
		BufferedImage image = loadImage(imagePath);

		if (image == null) {
			System.out.println("Image not found.");
			return;
		}

		JFrame frame = new JFrame("Task Two");
		Image panel = new Image(image);
		panel.setPreferredSize(new Dimension(image.getWidth(), image.getHeight()));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);

	}

	private static BufferedImage loadImage(String imagePath) {
		try {
			return ImageIO.read(new File(imagePath));
		} catch (IOException error) {
			System.out.println(error);
			return null;
		}
	}
}