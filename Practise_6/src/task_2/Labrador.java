package task_2;

public class Labrador extends Dog {
	public Labrador(String name, int age) {
		super(name, age);
	}

	@Override
	public void bark() {
		System.out.println("Лабрадор лает: Гав-гав!");
	}
}
