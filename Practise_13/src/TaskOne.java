import java.io.FileWriter;
import java.io.IOException;

public class TaskOne {

	public static void init(String text) {

		try {
			FileWriter fileWriter = new FileWriter("D:\\Jeka\\Code\\University\\Java\\Practise_13_+\\src\\file.txt", false);
			fileWriter.write(text);
			fileWriter.close();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
