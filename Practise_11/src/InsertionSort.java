import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
	private Random random = new Random();
	private final int studentsCount;
	private Student[] students;

	// Constructor
	public InsertionSort(int count) {
		this.studentsCount = count;
		this.students = new Student[this.studentsCount];

		for (int i = 0; i < this.studentsCount; i++)
			this.students[i] = new Student(random.nextInt(100) + 1);
	}

	// Return sorted array (immutable method)
	private Student[] getSortedArray() {
		Student[] sortedStudents = Arrays.copyOf(this.students, this.studentsCount);

		Student tempStudent = null;
		for (int i = 1; i < sortedStudents.length; i++) {
			for (int j = i; j > 0 && sortedStudents[j - 1].getId() > sortedStudents[j].getId(); j--) {
				tempStudent = sortedStudents[j];
				sortedStudents[j] = sortedStudents[j - 1];
				sortedStudents[j - 1] = tempStudent;
			}
		}

		return sortedStudents;
	}

	// Print student's ids in console
	private void printIds(Student[] students) {
		for (int i = 0; i < students.length; i++)
			System.out.print(" " + students[i].getId());

		System.out.println();
	}

	// Init
	public void init() {
		System.out.print("Ids of students after init:");
		this.printIds(students);

		System.out.print("Ids of students after sort:");
		Student[] sortedStudents = getSortedArray();
		this.printIds(sortedStudents);
	}
}
