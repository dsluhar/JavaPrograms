package AutomationScripts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PrintMinandMaxNumberFromArray {

	PrintMinandMaxNumberFromArray() {
	
	int[] IntArr = {25,378,25,40,5,599,6,4,7,8,-79,-100,-101,40};
	
	int MinNum = Integer.MAX_VALUE;
	int MaxNum = Integer.MIN_VALUE;

	for (int i=0; i< IntArr.length; i++) {
			if (IntArr[i] < MinNum ) {
				MinNum=IntArr[i];
			}
	}
	System.out.println("Minimum Number is : " +MinNum);
	
	for (int i=0; i< IntArr.length; i++) {
		if (IntArr[i] > MaxNum ) {
			MaxNum=IntArr[i];
		}
}
	System.out.println("Mamimum Number is : " +MaxNum);
	
 }
	public static void main(String args[]) {
		PrintMinandMaxNumberFromArray MinMax = new PrintMinandMaxNumberFromArray();
		}
}