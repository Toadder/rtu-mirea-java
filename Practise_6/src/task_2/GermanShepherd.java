package task_2;

public class GermanShepherd extends Dog {
	public GermanShepherd(String name, int age) {
		super(name, age);
	}

	@Override
	public void bark() {
		System.out.println("Немецкая овчарка лает: Ваф-ваф!");
	}
}
