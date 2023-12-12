public class Ball {
	private int size;
	private String color;

	// Constructor
	public Ball(int size, String color) {
		this.size = size;
		this.color = color;
	}

	public Ball(int size) {
		this.size = size;
		this.color = "red";
	}
	// /Constructor

	// Setters
	public void setSize(int size) {
		this.size = size;
	}

	public void setColor(String color) {
		this.color = color;
	}
	// /Setters

	// Getters
	public int getSize() {
		return this.size;
	}

	public String getColor() {
		return this.color;
	}
	// /Getters

	// toString
	public String toString() {
		return "Ball ==> size: " + this.size + " | color: " + this.color;
	}
	// /toString
}
