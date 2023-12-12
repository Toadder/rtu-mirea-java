package task_2_3;

public class Circle extends Shape {
	protected double radius = 0.0;

	public Circle() {}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}
	
	@Override
	public String toString() {
		return "Class " + this.getClass().getSimpleName() + " --> color: " + this.color + " filled: " + this.filled + " radius: " + this.radius;
	}

}
