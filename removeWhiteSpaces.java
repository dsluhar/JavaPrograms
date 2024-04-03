package AutomationScripts;
import java.util.*;

public class removeWhiteSpaces {
	
	public static String removeWhiteSpaces(String input) {
	
	StringBuilder output = new StringBuilder();
	
	String str = " sdfd dfdf TTY78 " ;
	
	System.out.println(str.strip());
	
	char[] charArray = input.toCharArray();
	
	for (char c : charArray) {
		if (!Character.isWhitespace(c))
			output.append(c);
	}
	
	return output.toString();
	}

	public static void main(String args[]) {
		System.out.println(removeWhiteSpaces(" gd ere trt iup wew UU "));
	}
}
