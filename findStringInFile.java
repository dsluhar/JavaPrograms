package AutomationScripts;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class findStringInFile {

	static boolean findStringInFile(String filePath, String str) throws FileNotFoundException {
		File file = new File(filePath);

		Scanner scanner = new Scanner(file);

		// read the file line by line
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			if (line.contains(str)) {
				scanner.close();
				return true;
			}
		}
		scanner.close();

		return false;
	}
	public static void main(String[] args) throws FileNotFoundException {

		System.out.println(findStringInFile("C:\\Dilip\\sample.txt", "Venkatesh"));
	}
}
