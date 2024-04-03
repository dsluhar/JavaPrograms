package AutomationScripts;

import java.util.Arrays;

public class PrintInitCapofWord {

	static void PrintInitCapofWord (String str) {
        
		char FirstChar = str.charAt(0);
		int cnt=0;
		System.out.print(FirstChar+ ".");
		for (int i=0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				cnt++;
				System.out.print(str.charAt(i+1)+ ".");
				System.out.print("Count is : "+ cnt);
			}
		}
	}

	public static void main(String[] args)
	{
		PrintInitCapofWord("Learning Java Script From Thapa") ;
	}
}