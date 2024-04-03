package AutomationScripts;

	public class UnderstadingSplitMethod {
	    public static void main(String args[]) {
	        String s = "alpha+beta+gama+delta+sigma";
	        String[] result = s.split("\\+", 0); // splitting the string at "+"
	        
	        for (String sub_string : result) {
	            System.out.println(sub_string);
	        }
	        
	        String s1 = "alpha beta gama delta sigma";
	        String[] words = s1.split(" ", 4);
	        
	        //using java loop to print elements of string array
	        for (int i = 0; i < words.length; i++) {
	            System.out.println(words[i]);
	        }
	        
	        String s11 = "alphabetagamadeltasigma";
	        String[] words11 = s11.split("");
	        
	        //using java loop to print elements of string array
	        for (int i = 0; i < words11.length; i++) {
	            System.out.print(words11[3]);
	        }
	        System.out.println();
	        String letters = "alpha, beta, gama, delta, sigma";

	        String result2[] = letters.split(",", 3);

	        for (int i = 0; i < result2.length; i++) {
	            System.out.println(result2[i]);
	        }
	    }
	}
