package AutomationScripts;

public class ThrowiLLegalArgumentException {

	    public static int getMaxValue(int[] arr) {
	        if (arr == null || arr.length == 0) {
	            // Handle edge case: empty array or null input
	            throw new IllegalArgumentException("Array must not be empty or null");
	        }

	        int max = arr[0]; // Assume the first element as maximum

	        // Iterate through the array to find the maximum value
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i]; // Update max if a larger value is found
	            }
	        }

	        return max;
	    }

	    public static void main(String[] args) {
	        //int[] numbers = {};
	        int[] numbers = {10, 5, 20, 15, -30};
	        int maxValue = getMaxValue(numbers);
	        System.out.println("Maximum value: " + maxValue);
	    }
	}
