public class Dog {
	private String name;
	private int age;

	// Constructor
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Dog(String name) {
		this.name = name;
		this.age = 0;
	}

	public Dog() {
		this.name = "Pup";
		this.age = 0;
	}
	// /Constructor

	// Setters
	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	// /Setters

	// Getters
	public String getName(String name) {
		return name;
	}

	public int getAge() {
		return age;
	}
	// /Getters

	// toString
	public String toString() {
		return this.name + ", age " + this.age;
	}
	// /toString

	// intoHumanAge
	public void intoHumanAge() {
		System.out.println(name + "'s age in human years is " + age * 7 + " years");
	}
	// /intoHumanAge
}