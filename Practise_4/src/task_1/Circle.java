package task_1;

public class Circle {
	private double radius;
	private double area;

	public Circle(double radius) {
		this.radius = radius;
		this.area = Math.PI * radius * radius;
	}

	public double getRadius() {
		return this.radius;
	}

	public double getArea() {
		return this.area;
	}

	public void setRadius(double radius) {
		this.radius = radius;
		this.area = Math.PI * radius * radius;
	}

	public void setArea(double area) {
		this.area = area;
		this.radius = Math.sqrt(this.area / Math.PI);
	}
}
