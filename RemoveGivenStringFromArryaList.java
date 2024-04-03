package AutomationScripts;
import java.util.ArrayList;

public class RemoveGivenStringFromArryaList {

	    public static void removeValue(ArrayList<String> list, String valueToRemove) {
	        for (int i = 0; i < list.size(); i++) {
	            if (list.get(i).equals(valueToRemove)) {
	                list.remove(i);
	                // Decrement i to account for the shifted elements
	                //i--;
	            }
	        }
	    }

	    public static void main(String[] args) {
	        // Example usage
	        ArrayList<String> names = new ArrayList<>();
	        names.add("Alice");
	        names.add("Bob");
	        names.add("Charlie");
	        names.add("Alice");
	        names.add("Dave");
	        names.add("Alice");

	        System.out.println("Original list: " + names);

	        removeValue(names, "Alice");

	        System.out.println("List after removing 'Alice': " + names);
	    }
	}
