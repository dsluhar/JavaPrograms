package AutomationScripts;

import java.util.HashMap;
import java.util.Map;

public class MapGetOrDefaultValue {

		    public static void main(String[] args) {
		        HashMap<String, Integer> map = new HashMap<>();
		        map.put("a", 100);
		        map.put("b", 200);
		        map.put("c", 300);
		        map.put("d", 400);
		        map.put("y", map.getOrDefault("d", 40));

		        int value = map.getOrDefault("y", 500);
		        System.out.println("Returned Value: " + value);
		        
		        for (Map.Entry<String, Integer> e : map.entrySet()) {
		        	System.out.println(e);
		        }
		    }
	}
