package AutomationScripts;

import java.util.HashSet;

public class OverRiddingExample {

	public static void main(String[] args) {
		class Base {
			void printName() {
				System.out.println("Base Class");
			}
		}

		class Child extends Base {
			@Override
			void printName() {
				super.printName();
				System.out.println("Child Class");
			}
		}
		Child ch = new Child();
		ch.printName();
		String s1 = "abc";
		String s2 = "abc";

		System.out.println("s1 == s2 is:" + (s1 == s2));
		
		String s3 = "JournalDev";
		int start = 1;
		char end = 7;

		System.out.println("Simply Print");
		
		String x = "abcdef";
		String y = "abc";
		
		x.subSequence(1,2);
		
		x.concat(y);

		System.out.println(((String) x.subSequence(0,2)).concat(y));
		
		System.out.println("pqr" + "pq");
		
		System.out.println(s3.substring(start, end));
		
		HashSet shortSet = new HashSet();

		for (short i = 1; i < 100; i++) {
		    shortSet.add(i);
		    shortSet.remove(i - 1);
		}

		System.out.println(shortSet.size());
		
	}
}
