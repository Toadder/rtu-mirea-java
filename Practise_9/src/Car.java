
public class Car implements Nameable, Priceable {
	private String name;
	private int price;

	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getPrice() {
		return this.price;
	}
}
