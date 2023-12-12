package task_1;

public class Cup extends Dish {
	private String color;

	public Cup(String material, double weight, String color) {
		super(material, weight);
		this.color = color;
	}

	@Override
	public void use() {
		System.out.println("Используется кружка для напитка");
	}

	public String getColor() {
		return color;
	}
}
