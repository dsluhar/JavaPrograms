package AutomationScripts;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {

			public static void main(String[] args) {
				String input = "hello";
				String result = removeDuplicates(input);
				System.out.println("Original string: " + input);
				System.out.println("String after removing duplicates: " + result);
				
				
			}

			public static String removeDuplicates(String str) 
			{
				//LinkedHashSet<Character> set = new LinkedHashSet<>();
				HashSet set = new HashSet();
				StringBuilder sb = new StringBuilder();

				for (int i = 0; i < str.length(); i++) {
					char c = str.charAt(i);
					if (!set.contains(c)) {
						set.add(c);
						sb.append(c);
					}
				}
				System.out.println("The Value is Set is : " +set);
				return sb.toString();
			}
		}
