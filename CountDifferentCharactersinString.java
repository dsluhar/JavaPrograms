package AutomationScripts;

import java.util.Arrays;
import java.math.*;

import io.cucumber.java.sl.In;

public class CountDifferentCharactersinString {

	CountDifferentCharactersinString() {
		String str = "PQRST 10  People...!  6956059n@#$%$%^%^" ;
		String newInCharacters = str.replaceAll("[^a-zA-Z]", "");
		String newInDigits = str.replaceAll("[^0-9]", "");
		String newSpecialChar = str.replaceAll("[!^a-zA-Z0-9]", " ").replaceAll("\\s+", " ");
		System.out.println("NEw Specialcharacter is : " +newSpecialChar);
	
		 int SpecialCharCount = 0;
		 
		 for (int i = 0; i < str.length(); i++) {
	            if (!Character.isDigit(str.charAt(i))
	                && !Character.isLetter(str.charAt(i))
	                && !Character.isWhitespace(str.charAt(i))) {
	            	SpecialCharCount++;
	            }
	        }
		
        System.out.println("The count of Characters are : " +newInCharacters.length());
        System.out.println("The count of Integers are : " +newInDigits.length());
        System.out.println("The count of Special Characters are : " +SpecialCharCount);
        System.out.println("The count2 of Special Characters are : " +newSpecialChar.length());
		
	}

	public static void main(String[] args)
	{
		CountDifferentCharactersinString CC = new CountDifferentCharactersinString();
	}
}
