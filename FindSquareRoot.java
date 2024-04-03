package AutomationScripts;

public class FindSquareRoot {

	    public static double squareRoot(double num) {
	        double precision = 0.000001; // Define precision for accuracy
	        double guess = num / 2; // Initial guess

	        // Iterate until the difference between guess^2 and num is within precision
	        while (Math.abs(guess * guess - num) > precision) {
	            // Update guess using Newton's method
	            guess = (guess + num / guess) / 2;
	        }

	        return guess;
	    }

	    public static void main(String[] args) {
	        double num = 1225; // Change this to test with different numbers
	        double sqrt = squareRoot(num);
	        System.out.println("Square root of " + num + " is: " + sqrt);
	    }
	}
