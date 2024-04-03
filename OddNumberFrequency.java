package AutomationScripts;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OddNumberFrequency {

	    public static Map<Integer, Integer> oddNumberFrequency(ArrayList<Integer> list) {
	        // Create a map to store odd numbers and their frequency
	        Map<Integer, Integer> frequencyMap = new HashMap<>();

	        // Iterate over the elements of the ArrayList
	        for (Integer num : list) {
	            // Check if the number is odd
	            if (num % 2 != 0) {
	                // Update the frequency of the odd number in the map
	                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
	            }
	        }
	        return frequencyMap;
	    }

	    public static void main(String[] args) {
	        // Example usage
	        ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(9);
	        numbers.add(100);
	        numbers.add(2);
	        numbers.add(5);
	        numbers.add(3);
	        numbers.add(1);
	        numbers.add(7);
	        numbers.add(7);

	        // Get the odd numbers and their frequency
	        Map<Integer, Integer> oddFrequency = oddNumberFrequency(numbers);

	        // Print the odd numbers and their frequency
	        System.out.println("Odd numbers and their frequency:");
	        for (Map.Entry<Integer, Integer> entry : oddFrequency.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	    }
}