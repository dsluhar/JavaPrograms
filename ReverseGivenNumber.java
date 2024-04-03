package AutomationScripts;

public class ReverseGivenNumber {
	
	public static void ReverseGivenNumber(Integer number) {

		Integer revNum = 0; 
		while (number !=0) {
			revNum = revNum * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Reversed Number is : " +revNum);
	}
	public static void main(String[] args) {
		ReverseGivenNumber(86250);
	}
}
