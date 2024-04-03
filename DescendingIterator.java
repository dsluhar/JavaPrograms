package AutomationScripts;

import java.util.LinkedList;

//How do you reverse a linked list in Java?

public class DescendingIterator {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();

		ll.add(1);
		ll.add(2);
		ll.add(4);
		ll.add(1);
		ll.add(3);

		System.out.println(ll);

		LinkedList<Integer> ll2 = new LinkedList<>();

		ll.descendingIterator().forEachRemaining(ll2::add);

		System.out.println(ll2);
	}

}
