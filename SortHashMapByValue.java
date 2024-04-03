package AutomationScripts;

import java.util.*;

public class SortHashMapByValue {
    private static Map<String, Integer> sortByValue(Map<String, Integer> scores) {
        Map<String, Integer> sortedByValue = new LinkedHashMap<>();

        // get the entry set
        Set<Map.Entry<String, Integer>> entrySet = scores.entrySet();

        // create a list since the set is unordered
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(entrySet);

        // sort the list by value
        entryList.sort((x, y) -> Integer.compare(x.getValue(), y.getValue()));

        // populate the new hash map
        for (Map.Entry<String, Integer> e : entryList)
            sortedByValue.put(e.getKey(), e.getValue());

        return sortedByValue;
    }

    public static void main(String[] args) {

        Map<String, Integer> scores = new HashMap<>();

        scores.put("David", 95);
        scores.put("Jane", 80);
        scores.put("Mary", 97);
        scores.put("Lisa", 78);
        scores.put("Dino", 65);

        System.out.println(scores);

        // Correct assignment of the sorted map back to 'scores'
        scores = sortByValue(scores);

        System.out.println(scores);
    }
}
