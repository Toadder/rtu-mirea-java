public class Calculator {
	public Calculator() {
	}

	public static <T extends Number, U extends Number> double sum(T num1, U num2) {
		return num1.doubleValue() + num2.doubleValue();
	}

	public static <T extends Number, U extends Number> double multiply(T num1, U num2) {
		return num1.doubleValue() * num2.doubleValue();
	}

	public static <T extends Number, U extends Number> double divide(T num1, U num2) {
		if (num2.doubleValue() == 0.0) {
			throw new ArithmeticException("Division by zero");
		} else {
			return num1.doubleValue() / num2.doubleValue();
		}
	}

	public static <T extends Number, U extends Number> double subtract(T num1, U num2) {
		return num1.doubleValue() - num2.doubleValue();
	}

	public static void main(String[] args) {
		int a = 10, b = 5;
		System.out.println("Sum: " + Calculator.sum(a, b));
		System.out.println("Multiply: " + Calculator.multiply(a, b));
		System.out.println("Divide: " + Calculator.divide(a, b));
		System.out.println("Subtract: " + Calculator.subtract(a, b));

		double x = 3.14, y = 1.5;
		System.out.println("Sum: " + Calculator.sum(x, y));
		System.out.println("Multiply: " + Calculator.multiply(x, y));
		System.out.println("Divide: " + Calculator.divide(x, y));
		System.out.println("Subtract: " + Calculator.subtract(x, y));
 }
}