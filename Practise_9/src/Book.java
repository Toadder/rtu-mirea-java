
public class Book implements Nameable, Priceable {
	private String name;
	private int price;
	
	public Book(String name, int price) {
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
