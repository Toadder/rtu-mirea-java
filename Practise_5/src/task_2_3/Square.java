package task_2_3;

public class Square extends Rectangle {
	public Square() {}

	public Square(double side) {
		super(side, side);
	}

	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}

	public double getSide() {
		return this.width;
	}

	public void setSide(double side) {
		this.width = side;
		this.length = side;
	}

	@Override
	public String toString() {
		return "Class " + this.getClass().getSimpleName() + " --> color: " + this.color + " filled: " + this.filled + 
		" side: " + this.width;
	}
}
