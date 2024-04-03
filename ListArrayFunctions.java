package AutomationScripts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListArrayFunctions {
	public static void main(String args[]) {
		int[] IntArray = {4001,25,378,25,40,5,599,6,0,7,8,-79,-100,101,40};
		
		Arrays.sort(IntArray);
		
		for (int i=0; i<IntArray.length;i++) {
			System.out.println("Element i is : " +i +"value of ith Element is : " + IntArray[i]);
		}
		
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3 = new ArrayList<Integer>();
		list2.add(808);
		list2.add(1008);
		
		for(Object o : list2) {
		    list3.add((Integer) o);
		}
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(960);
		list.add(10);
		list.add(50);
		list.add(1780);
		list.add(960);
		list.add(6954);
		System.out.println(list);
		list.add(4,20);  //add element on index 4
		System.out.println(list);
		list.addAll(list2);
		list.set(2,999999);
		System.out.println(list);
		System.out.println(list.contains(1008));
		System.out.println("Remove index element of  : " +list.remove(1));
		System.out.println("Remote Fix Value of : " +list.remove(Integer.valueOf(960)));
		System.out.println("index element get value is : " +list.get(1));
		System.out.println("List3 is Empty or Not : " +list.isEmpty());
		list2.clear();
		System.out.println("List2 is Empty or Not : " +list2.isEmpty());
		System.out.println("Values of List2 " +list2);
		System.out.println("Contain Value of List " +list.contains(6954));
	
		for (int i=0; i < list3.size(); i++) {
			System.out.println("Array3 element with FOR Loop : " +list3.get(i));
		}
		
		for (Integer element: list3) {
			System.out.println("Array3 element with For Each LOOP : " +element);
		}
		
		Iterator<Integer> it = list3.iterator();
		while (it.hasNext()) {
			System.out.println("Array3 element with ITERATOR LOOP : " +it.next());
		}
		
		//Code Snippet to delete Duplicate Values from Array
			Set<Integer> set = new HashSet<>();
			for (int i=0; i< IntArray.length; i++) {
				 set.add(IntArray[i]);
			}
			System.out.println("The Unique Values of Set are :" +set);
	}
}
