package AutomationScripts;

import java.util.Arrays;
import java.math.*;

import io.cucumber.java.sl.In;

public class PrimeNumber {

	public static void CheckWhetherTheNo_IsPrimeOrNot (int num) {
		
		int m=num/2;
		Boolean flag = true;
		for (int i = 2; i <= m; i++) {
	        if (num%i==0) {
	        		flag=false;
					break;
				}
		}
		if (flag == true) {
			System.out.println("The Number is Prime");
		}
		else {
			System.out.println("The Number is NOT Prime");
		}
	}
	public static void main(String[] args)
	{
		CheckWhetherTheNo_IsPrimeOrNot(57);
	}
}