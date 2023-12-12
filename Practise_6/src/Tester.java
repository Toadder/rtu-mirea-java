import task_1.Cup;
import task_1.Plate;
import task_2.GermanShepherd;
import task_2.Labrador;
import task_3.Chair;
import task_3.FurnitureShop;
import task_3.Sofa;

public class Tester {
	public static void test() {
		// --- TASK 1 ---
		Plate plate = new Plate("Керамика", 0.5, 20);
		Cup cup = new Cup("Стекло", 0.2, "Белая");

		plate.use();
		System.out.println("Материал тарелки: " + plate.getMaterial());
		System.out.println("Диаметр тарелки: " + plate.getDiameter());
		System.out.println("Вес тарелки: " + plate.getWeight() + "\n");

		cup.use();
		System.out.println("Материал кружки: " + cup.getMaterial());
		System.out.println("Цвет кружки: " + cup.getColor());
		System.out.println("Вес кружки: " + cup.getWeight());
		// --- /TASK 1 ---

		System.out.println("------");

		// --- TASK 2 ---
		Labrador labrador = new Labrador("Барон", 3);
		GermanShepherd shepherd = new GermanShepherd("Рекс", 4);

		System.out.println("Информация о лабрадоре:");
		System.out.println("Имя: " + labrador.getName());
		System.out.println("Возраст: " + labrador.getAge());
		labrador.bark();

		System.out.println("\nИнформация о немецкой овчарке:");
		System.out.println("Имя: " + shepherd.getName());
		System.out.println("Возраст: " + shepherd.getAge());
		shepherd.bark();
		// --- /TASK 2 ---

		System.out.println("------");

		// --- TASK 3 ---
		FurnitureShop shop = new FurnitureShop();

		Chair chair = new Chair("Стул Комфорт", 1500.0, 4);
		Sofa sofa = new Sofa("Диван Люкс", 5000.0, 3);

		System.out.println("Информация о мебели в магазине:");
		shop.displayFurnitureInfo(chair);
		System.out.println();
		shop.displayFurnitureInfo(sofa);
	}
	// --- /TASK 3 ---
}
