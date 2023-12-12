import java.io.Serializable;

interface Animal {
	// Some methods related to Animal
}

class MyClassAnimal implements Animal, Serializable {
	// Implementation for MyClassAnimal
}

public class GenericClass<T extends Comparable<T>, V extends Animal & Serializable, K> {
	private T firstParam;
	private V secondParam;
	private K thirdParam;

	public GenericClass(T firstParam, V secondParam, K thirdParam) {
		this.firstParam = firstParam;
		this.secondParam = secondParam;
		this.thirdParam = thirdParam;
	}

	public T getFirstParam() {
		return firstParam;
	}

	public V getSecondParam() {
		return secondParam;
	}

	public K getThirdParam() {
		return thirdParam;
	}

	public void displayClassNames() {
		System.out.println("Type of firstParam: " + firstParam.getClass().getSimpleName());
		System.out.println("Type of secondParam: " + secondParam.getClass().getSimpleName());
		System.out.println("Type of thirdParam: " + thirdParam.getClass().getSimpleName());
	}

	public static void main(String[] args) {
		Integer integerParam = 10;
		String stringParam = "Hello";
		MyClassAnimal animalParam = new MyClassAnimal();

		GenericClass<Integer, MyClassAnimal, Double> example = new GenericClass<>(integerParam, animalParam, 3.14);

		example.displayClassNames();
	}
}
