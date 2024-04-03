package AutomationScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class illustrateTryCatch {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("sample.txt");
			System.out.println("File is availabe in above path");
		} catch(FileNotFoundException e) {
			System.out.println("File is NOT availabe in above path");
			e.printStackTrace();
		}

	}

}
