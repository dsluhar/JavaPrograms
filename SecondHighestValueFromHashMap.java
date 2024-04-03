package AutomationScripts;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import java.util.*;

public class SecondHighestValueFromHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1334);
        map.put("B", 20);
        map.put("C", 1588);
        map.put("D", 5);
        map.put("D", 26);
        
        int secondHighest = findSecondHighest(map);
        System.out.println("Second highest value: " + secondHighest);
    }
    
    public static int findSecondHighest(HashMap<String, Integer> map) {
        List<Integer> values = new ArrayList<>(map.values());
        Collections.sort(values, Collections.reverseOrder());
        
        if (values.size() < 2) {
            throw new IllegalArgumentException("Map must contain at least two elements");
        }
        return values.get(1);
    }
}
