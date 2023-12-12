import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

// Shape
abstract class Shape {
	private Color color;
	private Point position;

	public Shape(Color color, Point position) {
		this.color = color;
		this.position = position;
	}

	public Color getColor() {
		return this.color;
	}

	public int getX() {
		return (int) this.position.getX();
	}

	public int getY() {
		return (int) this.position.getY();
	}

	abstract void draw(Graphics g);
}
// /Shape

// Rectangle
class Rectangle extends Shape {
	private int width;
	private int height;

	public Rectangle(Color color, Point position, int width, int height) {
		super(color, position);
		this.width = width;
		this.height = height;
	}

	public void draw(Graphics g) {
		g.setColor(this.getColor());
		g.fillRect(this.getX(), this.getY(), this.width, this.height);
	}
}
// /Rectangle

// Circle
class Circle extends Shape {
	private int radius;

	public Circle(Color color, Point position, int radius) {
		super(color, position);
		this.radius = radius;
	}

	public void draw(Graphics g) {
		g.setColor(this.getColor());
		g.fillOval(this.getX(), this.getY(), this.radius * 2, this.radius * 2);
	}
}
// /Circle

// Panel
class Panel extends JPanel {
	private Random random = new Random();

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (int i = 0; i < 20; ++i) {
			Shape shape;

			int rgbaRed = random.nextInt(0, 255);
			int rgbaGreen = random.nextInt(0, 255);
			int rgbaBlue = random.nextInt(0, 255);

			int x = random.nextInt(0, 200);
			int y = random.nextInt(0, 200);

			Color randomColor = new Color(rgbaRed, rgbaGreen, rgbaBlue);
			Point randomPosition = new Point(x, y);

			if (i % 2 == 0) {
				shape = new Circle(randomColor, randomPosition, 50);
			} else {
				shape = new Rectangle(randomColor, randomPosition, 200, 80);
			}

			shape.draw(g);
		}

	}
}
// /Panel

// Task One
public class TaskOne {
	public static void init() {
		JFrame frame = new JFrame("Task One");
		frame.setSize(400, 400);
		JPanel panel = new Panel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setVisible(true);
	}
}
// /Task One