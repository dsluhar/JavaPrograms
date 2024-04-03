package AutomationScripts;

import java.util.HashMap;

public class CharacterOccurrenceCounter {

	public static void main(String[] args) {
        String input = "hello hello ABCDE98 ";
        input = input.replaceAll("[\\s\\d]", "").toLowerCase();
        HashMap<Character, Integer> occurrences = CharacterOccurrenceCounter(input);
        System.out.println("Character occurrences in the string: " + occurrences);
        
        CharOccurances("AABCCd");
    }
	static int count=0;
    public static HashMap<Character, Integer> CharacterOccurrenceCounter(String str) {
        HashMap<Character, Integer> occurrenceMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
//            if (occurrenceMap.containsKey(c)) {
//            	count = occurrenceMap.getOrDefault(c, 0); 	
//            	 System.out.println("The count is :" +count);
//            }
            occurrenceMap.put(c, occurrenceMap.getOrDefault(c, 0) + 1);
        }
        //if (count>1) System.out.println("The count is :" +count);
        return occurrenceMap;
       
    }
    
    public static void CharOccurances(String str) {
    	HashMap<Character, Integer>  charCountMap = new HashMap<>();
    	
    	for (int i=0; i<str.length(); i++) {
    		char c = str.charAt(i);
    		charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
    	}
    	System.out.println(charCountMap);
    }
}
