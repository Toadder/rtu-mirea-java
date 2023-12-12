package task_3;

public class Sofa extends Furniture {
	private int numberOfSeats;

	public Sofa(String name, double price, int numberOfSeats) {
		super(name, price);
		this.numberOfSeats = numberOfSeats;
	}

	@Override
	public void displayInfo() {
		System.out.println("Диван: " + getName());
		System.out.println("Цена: " + getPrice() + " руб.");
		System.out.println("Количество сидений: " + numberOfSeats);
	}
}
