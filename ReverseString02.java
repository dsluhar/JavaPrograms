package AutomationScripts;

import org.bouncycastle.util.Arrays;

public class ReverseString02 {

	    public static String ReverseString02(String str) {
	        char[] charArray = str.toCharArray();
	        int left = 0;
	        int right = charArray.length - 1;

	        while (left < right) {
	            // Swap characters at left and right pointers
	            char temp = charArray[left];
	            charArray[left] = charArray[right];
	            charArray[right] = temp;

	            // Move pointers towards the center
	            left++;
	            right--;
	        }
	        return String.valueOf(charArray);
	    }

	    public static void main(String[] args) {
	        String str = "HelloWorld";
	        System.out.println("Original string: " + str);

	        // Reverse the string in place
	        String reversed = ReverseString02(str);
	        System.out.println("Reversed string: " + reversed);
	    }
}
