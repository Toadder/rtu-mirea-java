public class TaskOne {
	public void stepOne() {
		System.out.println(2 / 0); // ляжет из-за деления на ноль
	}

	public void stepTwo() {
		System.out.println(2.0 / 0.0); // Infinity
	}

	public void stepThree() {
		try {
			System.out.println(2 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Attempted division by zero"); // Отлов ошибки
		}
	}
}