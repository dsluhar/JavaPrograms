package AutomationScripts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateUsingStream {

	public static void main(String[] args) {
		
		int[] inputArray = {-79,25,37,25,40,5,599,6,0,37,8,-79,-100,101,40};
		
		findDuplicatesUsingJava8(inputArray);
		System.out.println("++++++++++++++++++++");
		findDuplicatesUsingBruteForce(inputArray);
		System.out.println("++++++++++++++++++++");
		findDuplicatesUsingHashSet(inputArray);

	}
	
	private static void findDuplicatesUsingJava8(int[] inputArray) 
	{   
	    Set<Integer> uniqueElements = new HashSet<>();
	         
	    Set<Integer> duplicateElements =  Arrays.stream(inputArray)
	                                            .filter(i -> !uniqueElements.add(i))
	                                            .boxed()
	                                            .collect(Collectors.toSet());
	         
	    System.out.println(duplicateElements);
	}

	private static void findDuplicatesUsingBruteForce(int[] inputArray)
	{
	    for (int i = 0; i < inputArray.length; i++) 
	    {
	        for (int j = i+1; j < inputArray.length; j++) 
	        {
	            if(inputArray[i] == inputArray[j])
	            {
	                System.out.println("Duplicate Element : "+inputArray[i]);
	            }
	        }
	    }
	}
	
	private static void findDuplicatesUsingHashSet(int[] inputArray)
	{
	    HashSet<Integer> set = new HashSet<Integer>();
	         
	    for (int element : inputArray) 
	    {
	        if(!set.add(element))
	        {
	            System.out.println("Duplicate Element : "+element);
	        }
	    }
	}
}
