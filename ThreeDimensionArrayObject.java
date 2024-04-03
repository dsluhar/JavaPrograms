package AutomationScripts;

public class ThreeDimensionArrayObject {

	    public static void main(String[] args) {
	        // Declare and initialize a three-dimensional array
	        Object[][][] threeDArray = new Object[3][3][3];

	        // Populate the array with some values
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                for (int k = 0; k < 3; k++) {
	                    threeDArray[i][j][k] = i + j + k;
	                }
	            }
	        }

	        // Access and print elements of the array
	        System.out.println("Elements of the three-dimensional array:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                for (int k = 0; k < 3; k++) {
	                    System.out.println("threeDArray[" + i + "][" + j + "][" + k + "] = " + threeDArray[i][j][k]);
	                }
	            }
	        }
	    }
	}