package AutomationScripts;

import java.util.Arrays;
import java.math.*;

import io.cucumber.java.sl.In;

public class SwapTwoNumbers {

	SwapTwoNumbers() {
		int A = 40;
		int B = 60;
		System.out.println("Before Swapping Number-A : " +A);
		System.out.println("Before Swapping Number-B : " +B);
		A = A+B;
		B = A-B;
		A = A-B;
		System.out.println("After Swapping Number-A : " +A);
		System.out.println("After Swapping Number-B : " +B);
		
	} 
	public static void main(String[] args)
	{
		SwapTwoNumbers CC = new SwapTwoNumbers();
	}
}