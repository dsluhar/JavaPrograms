package AutomationScripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionsClass {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(960);
		list.add(10);
		list.add(50);
		list.add(1780);
		list.add(960);
		list.add(10);
		
		System.out.println("Min Element from the Array is :" +Collections.min(list));
		System.out.println("MAX Element from the Array is :" +Collections.max(list));
		System.out.println("Frequency of Element from the Array is :" +Collections.frequency(list,10));
		
		Collections.sort(list);
		System.out.println("Sorted Array is  :" +list);
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println("Sorted Array in Reverse Order is :" +list);

	}
}
