package AutomationScripts;

import java.util.ArrayList;
import java.util.List;


class AnonymousArray {
	    public static void main(String[] args)
	    {
	          // anonymous array
	          sum(new int[]{ 1, 2, 3 });

	          //use of ForEach
	          List<String> list = new ArrayList<>();
	          list.add("AB"); list.add("CD");
	          list.forEach(System.out::print);
	          
	          //use of Lambda
	          Runnable r1 = () -> System.out.println("My Runnable");
	    }
	   
	    public static void sum(int[] a)
	    {
	        int total = 0;
	        // using for-each loop
	        for (int i : a) 
	            total = total + i;
	        System.out.println("The sum is: " + total);
	    }
	}