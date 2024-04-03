package AutomationScripts;

public class ReverseString {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Automation ABC");
		str = str.reverse();
		System.out.println("Reverse with StringBuilder is : " +str);
		
		String str1 = "ABC PQR";
		String str2 = "";
		String str3 = "   ABC PQR   ";
		System.out.println("String after stripping is : " +str3.strip().length());
		for (int i=0; i< str1.length();i++) {
			str2=(str1.charAt(i)+str2);
		}
		System.out.println("Reversed String is : " +str2);
	}
}
