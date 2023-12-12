import task_1.Circle;
import task_2.Human;
import task_3.Book;

public class Tester {

	public static void test() {

		// --- TASK 1 ---
		Circle circle = new Circle(1);

		System.out.println(circle.getRadius());
		System.out.println(circle.getArea());

		circle.setRadius(2);

		System.out.println(circle.getRadius());
		System.out.println(circle.getArea());

		circle.setArea(3.14);

		System.out.println(circle.getRadius());
		System.out.println(circle.getArea());
		// --- /TASK 1 ---

		System.out.println("------");

		// --- TASK 2 ---
		Human person = new Human("Blue", "dark", 42, 72);

		person.speak();
		person.walk();
		person.useHands();
		// --- /TASK 2 ---

		System.out.println("------");

		// --- TASK 3 ---
		Book book = new Book("The Titan", "Theodore Dreiser", 1914);

		System.out.println(book.getName());
		System.out.println(book.getAuthor());
		System.out.println(book.getYear());

		book.setName("The Financier");
		book.setYear(1912);

		System.out.println(book.getName());
		System.out.println(book.getAuthor());
		System.out.println(book.getYear());
		// --- /TASK 3 ---

	}

}