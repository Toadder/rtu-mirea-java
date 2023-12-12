package task_2_3;

public abstract class Shape {
	protected String color = "transparent";
	protected boolean filled = false;

	public Shape() {}
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return this.color;
	}

	public boolean isFilled() {
		return this.filled;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public String toString() {
		return "Class " + this.getClass().getSimpleName() + " --> color: " + this.color + " filled: " + this.filled;
	}

	public abstract double getArea();
	public abstract double getPerimeter();
	
}
