package AutomationScripts;
import java.util.Collections;
//Session by Anuj Bhaiya
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {

	public static void main(String[] args) {
		Map<String, Integer> numbers =  new HashMap<>();
		
		//Map<String, Integer> numbers =  new TreeMap<>();
		numbers.put("one", 70);
		numbers.put("two", 20);
		numbers.put("three", 20);
		numbers.put("ten", 88);
		numbers.put("four", 339);
		numbers.put("eight", 77);
		//numbers.putIfAbsent("Ten", 10);
		//numbers.remove("Ten");
		System.out.println(numbers);

		int max= Collections.max(numbers.values());
		int cnt =0;	
		//numbers.
		for (Map.Entry<String, Integer> e: numbers.entrySet()) {
			System.out.println(e);
			//int val = e.getValue();
			//if (val == max) {
				//numbers.remove(e.getKey());
			//}
			//System.out.println("Key is :" +e.getKey());
			//System.out.println("Value is :" +e.getValue());
		}
		
		for (String key: numbers.keySet()) {
			System.out.println("Only Key is :" +key);
		}
//		
		for (Integer value: numbers.values()) {
			System.out.println("Only Value is :" +value);
		}
//		
		System.out.println("Contains key :" +numbers.containsKey("eight"));
		System.out.println("Contains Value :" +numbers.containsValue(2));
		System.out.println("Contains Value :" +numbers.isEmpty());
		numbers.clear();
		System.out.println(numbers);
	}	
}
