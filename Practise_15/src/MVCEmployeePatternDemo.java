public class MVCEmployeePatternDemo {
	public static void main(String[] args) {
		// Создаем объекты модели, представления и контроллера
		Employee model = retriveEmployeeFromDatabase();
		EmployeeView view = new EmployeeView();
		EmployeeController controller = new EmployeeController(model, view);

		controller.updateView();

		controller.setHourlyRate(25);
		controller.setHoursWorked(45);

		System.out.println("\nAfter updating, Employee Details are as follows");
		controller.updateView();
	}

	private static Employee retriveEmployeeFromDatabase() {
		Employee employee = new Employee();
		employee.setName("Andrew");
		employee.setHourlyRate(20);
		employee.setHoursWorked(100);
		return employee;
	}
}
