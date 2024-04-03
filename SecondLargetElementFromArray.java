package AutomationScripts;

public class SecondLargetElementFromArray {

	    public static int secondLargest(int[] arr) {
	        if (arr.length < 2) {
	            // Handle case where array has less than 2 elements
	            throw new IllegalArgumentException("Array must have at least two elements");
	        }

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        // Find the largest and second largest elements in the array
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > largest) {
	                secondLargest = largest;
	                largest = arr[i];
	            } else if (arr[i] > secondLargest && arr[i] != largest) {
	            //} else if (arr[i]  > secondLargest) {	            	
	                secondLargest = arr[i];
	            }
	        }

	        // Return the second largest element
	        return secondLargest;
	    }

	    public static void main(String[] args) {
	        // Example usage
	        int[] numbers = {500, 500, -20,40, 15,77,78,-78, 30,78,-100};
	        int secondLargest = secondLargest(numbers);
	        System.out.println("Second largest element: " + secondLargest);
	        System.out.println(secondLargest(new int[] {861, 521, 975, 831, 975,479, 861}));
	        
	    }
}
