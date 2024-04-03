package AutomationScripts;

import java.util.Arrays;
import java.math.*;

import io.cucumber.java.sl.In;

public class PrintFactorial {

	public static double PrintFactorial (int num) {
		
		int Fact=1;
		for (int i=1; i <= num; i++) {
			Fact =  Fact * i;
		}
		return Fact;
	}

	public static void main(String[] args)
	{
		double vFact = PrintFactorial(10);
		System.out.println(vFact);
	}
}
