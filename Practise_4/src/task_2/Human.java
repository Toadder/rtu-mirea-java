package task_2;

public class Human {
	private Head head;
	private Leg leftLeg;
	private Leg rightLeg;
	private Hand leftHand;
	private Hand rightHand;

	public Human(String eyeColor, String hairColor, int legSize, int handLength) {
		this.head = new Head(eyeColor, hairColor);
		this.leftLeg = new Leg(legSize);
		this.rightLeg = new Leg(legSize);
		this.leftHand = new Hand(handLength);
		this.rightHand = new Hand(handLength);
	}

	public void speak() {
		head.talk();
	}

	public void walk() {
		leftLeg.walk();
		rightLeg.walk();
	}

	public void useHands() {
		leftHand.grab();
		rightHand.grab();
	}
}
