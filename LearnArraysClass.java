package AutomationScripts;

import java.util.Arrays;

public class LearnArraysClass {

	public static void main(String[] args) {
		
	int[] numbers = {56,7,89,12,90,23,44,32,80,33,44};
	//int[] numbers1 = {7,12,	23,	32,	33,	44,	44,	56,	80,	89,	90};
	Arrays.sort(numbers);
	//Arrays.fill(numbers, 8080); // to fill array with element 8080
	// for Parallel Sort array must have > 8192 elements
	
	for (int i=0; i < numbers.length; i++) {
	System.out.println(numbers[i]);
	}
	int Index = Arrays.binarySearch(numbers, 80);
	System.out.println("The index of element 80 is :" +Index);
	}

}
