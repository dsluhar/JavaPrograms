package AutomationScripts;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice01 {

	public static void main(String[] args) {
	
		//Map<String, Integer> DLMap1 = new HashMap<>();
		
		Map<String, Integer> DLMap1 = new TreeMap<>();
		
		DLMap1.put("Ten", 10);
		DLMap1.put("Three", 3);
		DLMap1.put("One", 1);
		DLMap1.put("Six", 6);
		DLMap1.put("Three Twenty", 320);
		DLMap1.put("PeoX", 18);
		DLMap1.put("Next", null);
		DLMap1.put("KeoKarpin", null);
		DLMap1.put("null", 30);
		DLMap1.put("null", 31);
		DLMap1.put("null", 32);
		DLMap1.put("One", 1);
		
		for (Map.Entry<String, Integer> e : DLMap1.entrySet()){
			System.out.println(e);
		}
		
//		for (String ks : DLMap1.keySet()){
//			System.out.println(ks);
//		}
//		
//		for (Integer mv : DLMap1.values()){
//			System.out.println(mv);
//		}
	}

}
