package task_2_3;

public class Rectangle extends Shape {
	protected double width = 0.0;
	protected double length = 0.0;

	public Rectangle() {
	}

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return this.width;
	}

	public double getLength() {
		return this.length;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getArea () {
		return this.width * this.length;
	}

	@Override
	public double getPerimeter() {
		return (this.width + this.length) * 2;
	}

	@Override
	public String toString() {
		return "Class " + this.getClass().getSimpleName() + " --> color: " + this.color + " filled: " + this.filled + 
		" width: " + this.width + " length: " + this.length;
	}
}
