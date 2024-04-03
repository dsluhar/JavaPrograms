package AutomationScripts;

import java.util.Arrays;
import java.math.*;

import io.cucumber.java.sl.In;

public class StringContainsVowels {

	StringContainsVowels() {
		Boolean flag = false;
		//String str = "Hello Friend" ;
		String str = "PQRST" ;
		flag = str.toLowerCase().matches(".*[aeiou].*");
		if (flag==true) {
			System.out.println("The String Contains Vowels");	
		}
		else {
			System.out.println("The String does not contain Vowels");
		}
	}

	public static void main(String[] args)
	{
		StringContainsVowels CC = new StringContainsVowels();
	}
}