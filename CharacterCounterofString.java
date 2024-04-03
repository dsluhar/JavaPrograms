package AutomationScripts;
import java.util.HashMap;

public class CharacterCounterofString {

			public static HashMap<String, Integer> countCharacters(String input) {
		        HashMap<String, Integer> charCounts = new HashMap<>();
		        char[] chars = input.toCharArray();

		        int letterCount = 0;
		        int charCount = 0;
		        int whitespaceCount = 0;
		        int specialCharCount = 0;

		        for (char c : chars) {
		            if (Character.isLetter(c)) {
		                letterCount++;
		            } else if (Character.isDigit(c)) {
		            	charCount++;
		            } else if (Character.isWhitespace(c)) {
		            	whitespaceCount++;
		            } else {
		                specialCharCount++;
		            }
		        }

		        charCounts.put("Letters", letterCount);
		        charCounts.put("Numbers", charCount);
		        charCounts.put("White Space", whitespaceCount);
		        charCounts.put("Special Characters", specialCharCount);

		        return charCounts;
		    }

		    public static void main(String[] args) {
		        String input = "Hello!.@#$%^. 123, world!";
		        HashMap<String, Integer> charCounts = countCharacters(input);
		        System.out.println("Character counts: " + charCounts);
		    }
}
