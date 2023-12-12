import java.util.ArrayList;
import java.util.List;

public class MergeSort {
	private List<Student> listOne = new ArrayList<Student>();
	private List<Student> listTwo = new ArrayList<Student>();
	private List<Student> listRes = new ArrayList<Student>();

	// Constructor
	public MergeSort(int count) {
		for (int i = 0; i < count; i++) {
			listOne.add(new Student());
			listTwo.add(new Student());
		}

		listRes.addAll(listOne);
		listRes.addAll(listTwo);
	}

	// Init
	public void init() {
		System.out.println("List one:");
		this.printList(listOne);

		System.out.println("List two:");
		this.printList(listTwo);

		mergeSort(listRes, listRes.size());
		System.out.println("Result list:");
		this.printList(this.listRes);
	}

	// Print list
	private void printList(List<Student> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("{ id: " + list.get(i).getId() + "; gpa: " + list.get(i).getGPA() + " }");
		}
	}

	// Merge Sort
	public void mergeSort(List<Student> list, int n) {
		if (n < 2) {
			return;
		}

		int mid = n / 2;
		List<Student> l = new ArrayList<Student>();
		List<Student> r = new ArrayList<Student>();

		for (int i = 0; i < mid; i++)
			l.add(list.get(i));
		for (int i = mid; i < n; i++)
			r.add(list.get(i));

		mergeSort(l, mid);
		mergeSort(r, n - mid);

		merge(list, l, r, mid, n - mid);
	}

	public static void merge(
			List<Student> a, List<Student> l, List<Student> r, int left, int right) {

		int i = 0, j = 0, k = 0;
		double firstGpa, secondGpa;
		
		while (i < left && j < right) {
			firstGpa = l.get(i).getGPA();
			secondGpa = r.get(j).getGPA();

			if (firstGpa <= secondGpa)
				a.set(k++, l.get(i++));
			else
				a.set(k++, r.get(j++));
		}

		while (i < left)
			a.set(k++, l.get(i++));

		while (j < right)
			a.set(k++, r.get(j++));
	}
}
