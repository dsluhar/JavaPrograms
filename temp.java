package AutomationScripts;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.collections.bag.SynchronizedSortedBag;

public class temp {

	private static final String Integer = null;

	public static void main(String[] args) {
		
		Map<Integer, String> dlMap = new HashMap();
		dlMap.put(2, "Saket");
		dlMap.put(25, "Saurav");
		dlMap.put(12, "HashMap");
		
		//String[] tArray = {'t','s','o','k'} ;
		
		String[] tArray = {"t","o","k"} ;
		
		String str = String.join(",", tArray);
		str=str.trim().replaceAll("[\\s,]", "");
		
		String str1 = Stream.of("a", "b", "c").collect(Collectors.joining(","));
		
//		System.out.println("Available String is : " +str);
//		
//		for (char s : str) {
//			tArray.length;
//		}
		
		int mapSize = dlMap.size();
		
		Iterator it = dlMap.entrySet().iterator();
		
		while (it.hasNext()) {
		   //System.out.println(it.next());
			Map.Entry me = (Map.Entry) it.next();
			System.out.println(me.getKey()+ " " + me.getValue());
		}
		
		String str4 = "NewYorkLondonArjetina";
		char[] charArr = str4.toCharArray();
		
		int Left =0;
		int Right=charArr.length-1;
		while (Left < Right) {
			char temp = charArr[Left];
			charArr[Left] = charArr[Right];
			charArr[Right] = temp;
			
			Left++;
			Right--;
			
		}
		System.out.println("The Revere String is : " +String.valueOf(charArr));
		
		String sentence = "I am a java developer I java and I am proud of it";
		String[] words = sentence.split(" ");
		
		HashMap<String, Integer> dMap1 = new HashMap();
				
		for (String w : words) {
			dMap1.put(w, dMap1.getOrDefault(w, 0)+1);
			}
		for (Map.Entry<String, Integer> entry : dMap1.entrySet()) {
            if (dMap1.get(entry.getKey()) > 1) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
        }
		Object[][][] threeDArray = new Object[3][3][3];
		
	}
}