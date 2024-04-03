package AutomationScripts;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromInputArray {

	    public static void removeDuplicates(ArrayList<Integer> list) {
	        // Create a HashSet to store unique values
	        Set<Integer> set = new HashSet<>(list);

	        // Clear the original list
	        list.clear();

	        // Add the unique values back to the original list
	        list.addAll(set);
	    }

	    public static void main(String[] args) {
	        // Example usage
	        ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(20); // Duplicate
	        numbers.add(40);
	        numbers.add(30); // Duplicate
	        numbers.add(10); // Duplicate

	        System.out.println("List before removing duplicates: " + numbers);

	        // Remove duplicates from the list
	        removeDuplicates(numbers);

	        System.out.println("List after removing duplicates: " + numbers);
	    }
	}
