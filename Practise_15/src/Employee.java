public class Employee {
	private String name;
	private int hourlyRate;
	private int hoursWorked;

	public Employee() {}

	public void setName(String name) {
		this.name = name;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public String getName() {
		return this.name;
	}

	public int getHourlyRate() {
		return this.hourlyRate;
	}

	public int getHoursWorked() {
		return this.hoursWorked;
	}

	public int calculateSalary() {
		return this.hourlyRate * this.hoursWorked;
	}
}
