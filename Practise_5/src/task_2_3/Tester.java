package task_2_3;

public class Tester {
	public static void test() {
		Shape s1 = new Circle(5.5, "RED", false);

		System.out.println(s1); // which version? --> Circle
		System.out.println(s1.getArea()); // which version? --> Circle
		System.out.println(s1.getPerimeter()); // which version? --> Circle
		System.out.println(s1.getColor());
		System.out.println(s1.isFilled());

		/*
		 * System.out.println(s1.getRadius());
		 * Так делать нельзя, т.к. геттер getRadius реализовывается в классе Circle
		 * А мы работаем с объектом типа Shapе
		 */

		System.out.println("----------");

		Circle c1 = (Circle) s1; // явное приведение типов
		System.out.println(c1);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getColor());
		System.out.println(c1.isFilled());
		System.out.println(c1.getRadius());

		System.out.println("----------");

		/*
		 * Shape s2 = new Shape();
		 * Нельзя создавать экземпляр абстрактного класса,
		 * Который служит своеобразным прототипом для других классов
		 */

		Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // upcast
		System.out.println(s3);
		System.out.println(s3.getArea());
		System.out.println(s3.getPerimeter());
		System.out.println(s3.getColor());

		/*
		 * System.out.println(s3.getLength());
		 * Геттер getLength определён для объектов типа Rectangle и Square,
		 * Но не для объектов типа Shape
		 */

		System.out.println("----------");

		Rectangle r1 = (Rectangle) s3; // downcast
		System.out.println(r1);
		System.out.println(r1.getArea());
		System.out.println(r1.getColor());
		System.out.println(r1.getLength());

		System.out.println("----------");

		Shape s4 = new Square(6.6); // Upcast
		System.out.println(s4);
		System.out.println(s4.getArea());
		System.out.println(s4.getColor());

		/*
		 * System.out.println(s4.getSide());
		 * Геттер getSide определён для объектов типа Square,
		 * Но не для объектов типа Shape
		 */

		System.out.println("----------");

		Rectangle r2 = (Rectangle) s4;
		System.out.println(r2);
		System.out.println(r2.getArea());
		System.out.println(r2.getColor());
		System.out.println(r2.getLength());

		/*
		 * System.out.println(r2.getSide());
		 * Геттер getSide определён для объектов типа Square,
		 * Но не для объектов типа Rectangle
		 */

		System.out.println("----------");

		Square sq1 = (Square)r2;
		System.out.println(sq1);
		System.out.println(sq1.getArea());
		System.out.println(sq1.getColor());
		System.out.println(sq1.getSide());
		System.out.println(sq1.getLength());
	}
}
