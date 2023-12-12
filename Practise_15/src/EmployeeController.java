public class EmployeeController {
	private Employee model;
	private EmployeeView view;

	public EmployeeController(Employee model, EmployeeView view) {
		this.model = model;
		this.view = view;
	}

	public void setEmployeeName(String name) {
		this.model.setName(name);
	}

	public void setHourlyRate(int hourlyRate) {
		this.model.setHourlyRate(hourlyRate);
	}

	public void setHoursWorked(int hoursWorked) {
		this.model.setHoursWorked(hoursWorked);
	}

	public void updateView() {
		this.view.printEmployeeDetails(this.model.getName(), this.model.calculateSalary());
	}
}
