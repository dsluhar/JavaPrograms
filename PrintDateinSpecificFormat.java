package AutomationScripts;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PrintDateinSpecificFormat {

	public static void main(String[] args) {
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		System.out.println(date); 

		LocalDate Ldate = LocalDate.of(2024, 3, 1); //yyyy mm dd
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d'st' MMMM, yyyy");
        String formattedDate = formatter.format(Ldate);
        System.out.println("Date: " + formattedDate);
		}
}
