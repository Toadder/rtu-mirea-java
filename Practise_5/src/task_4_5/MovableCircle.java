package task_4_5;

public class MovableCircle implements Movable {
	private int radius;
	private MovablePoint center = null;

	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		this.radius = radius;
		this.center = new MovablePoint(x, y, xSpeed, ySpeed);
	}

	public String toString() {
		return "Class " + this.getClass().getSimpleName() + " --> center: " + this.center.toSting() + "; radius: "
				+ this.radius;
	}

	@Override
	public void moveUp() {
		this.center.moveUp();
	}

	@Override
	public void moveDown() {
		this.center.moveDown();
	}

	@Override
	public void moveRight() {
		this.center.moveRight();
	}

	@Override
	public void moveLeft() {
		this.center.moveLeft();
	}

}
