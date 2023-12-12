import java.io.FileReader;
import java.io.IOException;

public class TaskTwo {

	public static void init() {

		try {
			FileReader fileReader = new FileReader("D:\\Jeka\\Code\\University\\Java\\Practise_13_+\\src\\file.txt");

			System.out.print("Вывод из файла: ");

			int c;
			while ((c = fileReader.read()) != -1) {
				System.out.print((char) c);
			}
			System.out.println();

			fileReader.close();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
