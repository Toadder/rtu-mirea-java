import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TaskFour {

	public static List<String> listFilesInDirectory(String directoryPath) {
		File directory = new File(directoryPath);
		List<String> fileList = new ArrayList<>();

		if (directory.exists() && directory.isDirectory()) {
			File[] files = directory.listFiles();

			for (int i = 0; i < 5; i++) {
				fileList.add(files[i].getName());
			}
		}

		return fileList;

	}

	public static void main(String[] args) {
		String directoryPath = "D:\\Jeka\\Code\\University\\Java";

		List<String> fileList = listFilesInDirectory(directoryPath);

		System.out.println("First five items: ");
		for (String file : fileList) {
			System.out.println(file);
		}
	}
}
