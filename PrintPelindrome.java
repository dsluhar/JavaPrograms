package AutomationScripts;

import java.util.Arrays;
import java.math.*;

import io.cucumber.java.sl.In;

public class PrintPelindrome {

	public static void PrintPelindrome (String str) {
		
		int n=str.length();
		Boolean flag = true;
		for (int i = 0; i < n/2; i++) {
	        if (str.charAt(i) != str.charAt(n-i-1))
	        		flag=false;
					break;
				}
		if (flag == true) {
			System.out.println("String is Pelindrome");
		}
		else {
			System.out.println("String is not Pelindrome");
		}
	} 

	public static void main(String[] args)
	{
		PrintPelindrome("abccba");
	}
}