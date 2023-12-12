import java.util.Random;

public class Student {
	private Random random = new Random();

	private int id;
	private static int lastId = 0;
	private double gpa;

	public Student() {
		this.id = ++Student.lastId;
		this.gpa = generateRandomGPA();
	}

	public Student(int id) {
		this.id = id;
		this.gpa = generateRandomGPA();
	}

	public int getId() {
		return this.id;
	}

	public double getGPA() {
		return this.gpa;
	}

	public void setValues(int id, double gpa) {
		this.id = id;
		this.gpa = gpa;
	}

	private double generateRandomGPA() {
		double randomGpa = 3.0 + (5.0 - 3.0) * this.random.nextDouble(); // [3.0; 5.0]
		return Math.round(randomGpa * 100.0) / 100.0;
	}
}
