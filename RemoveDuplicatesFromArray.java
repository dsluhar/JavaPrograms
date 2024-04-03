package AutomationScripts;
import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.*;

public class RemoveDuplicatesFromArray {

	    public static int[] removeDuplicates(int[] arr) {
	        Set<Integer> set = new HashSet<>();
	        List<Integer> list = new ArrayList<>();

	        // Add unique elements to the set
	        for (int num : arr) {
	            if (!set.contains(num)) {
	                set.add(num);
	                list.add(num);
	            }
	        }

	        // Convert list back to array
	        int[] result = new int[list.size()];
	        for (int i = 0; i < list.size(); i++) {
	            result[i] = list.get(i);
	        }

	        return result;
	    }
	    
	    public static Character[] removeDuplicatesFromCharacterArray(Character[] arr) {
	        Set<Character> set = new HashSet<>();
	        List<Character> list = new ArrayList<>();
	        
	        // Add unique elements to the set
	        for (Character str : arr) {
	            if (!set.contains(str)) {
	            	set.add(str);
	            	list.add(str);
	            }
	        }

	        // Convert list back to array
	        Character[] result = new Character[list.size()];
	        for (int i = 0; i < list.size(); i++) {
	            result[i] = list.get(i);
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 2, 3, 5, 6, 7, 4, 8, 1, 9};
	        System.out.println("Original array: " + Arrays.toString(arr));

	        int[] uniqueArray = removeDuplicates(arr);
	        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
	        
	        Character[] arr1 = {'A','B','C','D','D','B'} ;
	        
	        System.out.println("Original array: " + Arrays.toString(arr1));

	        Character[] UniqueCharacter = removeDuplicatesFromCharacterArray(arr1);
	        System.out.println("Array after removing duplicates: " + Arrays.toString(UniqueCharacter));
	    }
	}
