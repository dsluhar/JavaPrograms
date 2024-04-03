package AutomationScripts;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.collections.bag.SynchronizedSortedBag;

public class LearnSet {

	public static void main(String[] args) {
		//Set<Integer> set = new HashSet<>();
		// Can't add Duplicate element in HashSet (Operations carried out in Big(1)
		Set<Integer> set = new LinkedHashSet<>(); //Values are displayed in Order
		//Set<Integer> set = new TreeSet<>(); //Values are displayed in Order (operation are carried out in O(LogN)
		set.add(1033);
		set.add(33);
		set.add(5633);
		set.add(10);
		set.add(3563);
		set.add(33);
		set.add(533);
		set.add(1023);
		set.add(null);
		set.add(null);
		
		System.out.println(set.contains(3563));
		System.out.println(set);
		set.remove(3563);
		System.out.println(set.contains(33));
		System.out.println(set.isEmpty());
		
		for(Integer element : set) {
			System.out.println(element);
		}
	}

}
