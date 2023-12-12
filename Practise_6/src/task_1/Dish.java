package task_1;

abstract class Dish {
	private String material;
	private double weight;

	public Dish(String material, double weight) {
		this.material = material;
		this.weight = weight;
	}

	public abstract void use();

	public String getMaterial() {
		return material;
	}

	public double getWeight() {
		return weight;
	}
}
