package task_4_5;

public class MovablePoint implements Movable {
	protected int x;
	protected int y;
	protected int xSpeed;
	protected int ySpeed;

	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public String toSting() {
		return "Class " + this.getClass().getSimpleName() + " --> x: " + this.x + "; y: " + this.y +
				"; xSpeed: " + this.xSpeed + "; ySpeed: " + this.ySpeed;
	}

	@Override
	public void moveUp() {
		this.y += this.ySpeed;
	}

	@Override
	public void moveDown() {
		this.y -= this.ySpeed;
	}

	@Override
	public void moveRight() {
		this.x += this.xSpeed;
	}

	@Override
	public void moveLeft() {
		this.x -= this.xSpeed;
	}
}
