package AutomationScripts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PrintFibonacciSequence {

	public static void PrintFibonacciSequence(int count) {
	
		int a = 0;
		int b = 1;
		int c = 1;
		System.out.print("Fibonnacci Sequence is : ");
		for (int i=1 ; i<=count; i++) {
			System.out.print(a + " ");
			a=b;
			b=c;
			c=a+b;
		}
	}
	
	public static void main(String args[]) {
		PrintFibonacciSequence(10);
		}
}
