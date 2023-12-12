public class Tester {
	public static void test() {
		// Dog
		Dog dog_1 = new Dog("Mike", 2);
		Dog dog_2 = new Dog("Helen", 7);
		Dog dog_3 = new Dog("Bob");

		dog_3.setAge(1);

		System.out.println(dog_1);

		dog_1.intoHumanAge();
		dog_2.intoHumanAge();
		dog_3.intoHumanAge();
		// /Dog

		System.out.println("-----------------------");

		// Ball
		Ball ball_1 = new Ball(10, "brown");
		Ball ball_2 = new Ball(20);

		ball_2.setColor("yellow");

		System.out.println(ball_1.toString());
		System.out.println(ball_2.toString());
		// /Ball

		System.out.println("-----------------------");

		// Book
		Book book_1 = new Book("Theodore Dreiser", "The Financier", 608);
		Book book_2 = new Book("Theodore Dreiser", "The Stoic");

		book_2.setPageQty(544);

		System.out.println(book_1.toString());
		System.out.println(book_2.toString());
		// /Book
	}
}