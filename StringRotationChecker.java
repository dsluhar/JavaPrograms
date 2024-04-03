package AutomationScripts;

public class StringRotationChecker {

	    public static void main(String[] args) {
	        String str1 = "abcd";
	        String str2 = "dabc";
	        
	        if (areRotations(str1, str2)) {
	            System.out.println("Strings are rotations of each other.");
	        } else {
	            System.out.println("Strings are not rotations of each other.");
	        }
	    }

	    public static boolean areRotations(String str1, String str2) {
	        // Check if both strings have the same length and are not empty
	        if (str1.length() != str2.length() || str1.isEmpty() || str2.isEmpty()) {
	            return false;
	        }

	        // Concatenate str1 with itself
	        String concatenated = str1 + str1;

	        // Check if str2 is a substring of the concatenated string
	        return concatenated.contains(str2);
	    }
	}
