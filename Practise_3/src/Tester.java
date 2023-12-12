public class Tester {
	public static void test() {
		Author levTolstoy = new Author("Лев Толстой", "lev_tolstoa@gmail.com", 'M');
		Author annaAhmatova = new Author("Анна Ахматова", "anna_ahmatova@gmail.com", 'F');

		System.out.println(annaAhmatova.toString());

		annaAhmatova.setEmail("ne_anna_ahmatova@gmail.com");

		System.out.println(levTolstoy.toString());
		System.out.println(annaAhmatova.toString());

		System.out.println("-------");

		Ball ball = new Ball(10, 0);
		System.out.println(ball.toString());

		ball.setY(10);
		System.out.println(ball.toString());

		ball.setXY(20, 20);
		System.out.println(ball.toString());

		ball.move(50, 30);
		System.out.println(ball.toString());
	}
}
