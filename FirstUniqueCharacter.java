package AutomationScripts;
import java.util.HashMap;

public class FirstUniqueCharacter {

	    public static char firstUnique(String s) {
	        HashMap<Character, Integer> charCount = new HashMap<>();

	        // Count occurrences of each character
	        for (char c : s.toCharArray()) {
	            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
	        }

	        // Find the first unique character
	        for (char c : s.toCharArray()) {
	            if (charCount.get(c) == 1) {
	                return c;
	            }
	        }
	        // If no unique character found, return '$' as a sentinel value
	        return '$';
	    }

	    public static void main(String[] args) {
	        String input = "lleettccooddee";
	        char result = firstUnique(input);
	        if (result != '$') {
	            System.out.println("The first unique character is: " + result);
	        } else {
	            System.out.println("No unique character found in the string.");
	        }
	    }
	}
