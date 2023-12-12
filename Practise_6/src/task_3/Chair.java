package task_3;

public class Chair extends Furniture {
	private int numberOfLegs;

	public Chair(String name, double price, int numberOfLegs) {
		super(name, price);
		this.numberOfLegs = numberOfLegs;
	}

	@Override
	public void displayInfo() {
		System.out.println("Стул: " + getName());
		System.out.println("Цена: " + getPrice() + " руб.");
		System.out.println("Количество ног: " + numberOfLegs);
	}
}
