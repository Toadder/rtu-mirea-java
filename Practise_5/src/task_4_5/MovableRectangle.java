package task_4_5;

public class MovableRectangle implements Movable {
	private MovablePoint topLeft = null;
	private MovablePoint bottomRight = null;

	public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
		this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
		this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
	}

	public String toString() {
		return "Class " + this.getClass().getSimpleName() + " --> " + this.topLeft.toSting() + "; "
				+ this.bottomRight.toSting();
	}

	@Override
	public void moveUp() {
		if (!this.checkSpeed()) {
			System.out.println("Speeds aren't equal");
			return;
		}

		this.topLeft.moveUp();
		this.bottomRight.moveUp();
	}

	@Override
	public void moveDown() {
		if (!this.checkSpeed()) {
			System.out.println("Speeds aren't equal");
			return;
		}

		this.topLeft.moveDown();
		this.bottomRight.moveDown();
	}

	@Override
	public void moveRight() {
		if (!this.checkSpeed()) {
			System.out.println("Speeds aren't equal");
			return;
		}

		this.topLeft.moveRight();
		this.bottomRight.moveRight();
	}

	@Override
	public void moveLeft() {
		if (!this.checkSpeed()) {
			System.out.println("Speeds aren't equal");
			return;
		}

		this.topLeft.moveLeft();
		this.bottomRight.moveLeft();
	}

	private boolean checkSpeed() {
		return this.topLeft.xSpeed == this.bottomRight.xSpeed &&
				this.topLeft.ySpeed == this.bottomRight.ySpeed;
	}
}
