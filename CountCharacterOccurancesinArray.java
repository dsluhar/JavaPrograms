package AutomationScripts;

import java.util.HashMap;

public class CountCharacterOccurancesinArray {

	public static void CharCount() {
		int[] intArr = {4,500,9,4,6,88,77,30,500,70,100,500};
		HashMap<Integer,Integer> dMap = new HashMap<>();
		
		for (int i : intArr) {
			dMap.put(i, dMap.getOrDefault(i,0)+1);
		}
		System.out.println(dMap);
		
		String[] StrArr = {"Squash", "Swimming","VolleyBall"," javelin throw","HighJump"," javelin throw","VolleyBall","Swimming"};
		HashMap<String,Integer> dStringMap = new HashMap<>();
		
		for (int i = 0; i < StrArr.length; i++) {
			StrArr[i] = StrArr[i].trim(); // Remove leading and trailing whitespace
			//StrArr[i] = StrArr[i].split("\\s+")[0]; // Split the string by whitespace and take the first part
			StrArr[i] = StrArr[i].split(",")[0]; // Split the string by whitespace and take the first part
			dStringMap.put(StrArr[i], dStringMap.getOrDefault(StrArr[i],0)+1);
        }
		System.out.println(dStringMap);
	}
	public static void main(String[] args) {
		CharCount();
	}
}
