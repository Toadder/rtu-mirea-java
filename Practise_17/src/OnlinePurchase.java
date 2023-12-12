import java.util.Scanner;

public class OnlinePurchase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Запрос ФИО и ИНН у пользователя
		System.out.print("Введите ваше ФИО: ");
		String fullName = scanner.nextLine();

		System.out.print("Введите ваш ИНН: ");
		String inn = scanner.nextLine();

		try {
			if (isValidInn(inn)) {
				System.out.println("Ваш заказ успешно оформлен!");
			} else {
				System.out.println("Неверный ИНН. Пожалуйста, введите корректный номер ИНН.");
			}
		} catch (InvalidInnException e) {
			System.out.println("Ошибка: " + e.getMessage());
		}
	}

	private static boolean isValidInn(String inn) throws InvalidInnException {
		if (inn.length() != 10 || !inn.matches("\\d+")) {
			throw new InvalidInnException("Недействительный ИНН. ИНН должен состоять из 10 цифр.");
		}

		return true;
	}
}
