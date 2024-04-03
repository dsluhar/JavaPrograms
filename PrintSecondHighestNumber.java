package AutomationScripts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PrintSecondHighestNumber {

	PrintSecondHighestNumber() {
	
	//int[] IntArr = {-54,25,201,50,22,-80,99,80,77,0,-44};
	int[] IntArr = {-2,-1,0,1,2,3,4,5};
	
	int Highest = Integer.MIN_VALUE;
	int SecondHighest = Integer.MIN_VALUE;

	for (int i : IntArr) {
			if (i > Highest ) {
				Highest = i;
			} 
		}
	System.out.println("Highest No. is : " +Highest);
	for (int i : IntArr) {
		if (i != Highest && i > SecondHighest ) {
			SecondHighest = i;
		} 
	}
			System.out.println("Second Highest No. is : " +SecondHighest);
	}
	
	public static void main(String args[]) {
		
		PrintSecondHighestNumber Highest = new PrintSecondHighestNumber();
		
		}
}
