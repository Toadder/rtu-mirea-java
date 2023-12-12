import java.util.Arrays;

public class SortingStudentsByGPA {
	private final int studentsCount;
	private Student[] students;
	private Student[] copyStudents;

	// Constructor
	public SortingStudentsByGPA(int count) {
		this.studentsCount = count;
		this.students = new Student[this.studentsCount];

		for (int i = 0; i < this.studentsCount; i++) {
			this.students[i] = new Student();
		}
		this.copyStudents = Arrays.copyOf(this.students, this.studentsCount);
	}

	// Init
	public void init() {
		System.out.println("Students after init:");
		this.printStudents(this.students);

		quickSort(0, this.studentsCount - 1);
		System.out.println("Students after sort:");
		this.printStudents(this.copyStudents);
	}

	// Print array
	private void printStudents(Student[] students) {
		for (int i = 0; i < this.studentsCount; i++) {
			System.out.println("{ id: " + this.students[i].getId() + "; gpa: " + this.students[i].getGPA() + " }");
		}
	}

	// Quick Sort
	private void quickSort(int lowerIndex, int higherIndex) {
		int i = lowerIndex;
		int j = higherIndex;
		double pivot = this.copyStudents[lowerIndex + (higherIndex - lowerIndex) / 2].getGPA();

		while (i <= j) {

			while (this.copyStudents[i].getGPA() > pivot)
				i++;
			while (this.copyStudents[j].getGPA() < pivot)
				j--;

			if (i <= j) {
				int iTempId = this.copyStudents[i].getId();
				double iTempGpa = this.copyStudents[i].getGPA();
				int jTempId = this.copyStudents[j].getId();
				double jTempGpa = this.copyStudents[j].getGPA();

				this.copyStudents[i].setValues(jTempId, jTempGpa);
				this.copyStudents[j].setValues(iTempId, iTempGpa);

				i++;
				j--;
			}
		}

		if (lowerIndex < j)
			quickSort(lowerIndex, j);
		if (i < higherIndex)
			quickSort(i, higherIndex);
	}

}