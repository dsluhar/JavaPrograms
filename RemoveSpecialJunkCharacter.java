package AutomationScripts;

public class RemoveSpecialJunkCharacter {
	
	public static void RemoveSpecialJunkCharacter(String str, String str2) {

		str = str.replaceAll("[^a-z, A-Z, 0-9]", "");
		
		//to find the length of String without using length
		System.out.println(str2.lastIndexOf(""));
		
		System.out.println(str);
		}
	public static void main(String[] args) {
		RemoveSpecialJunkCharacter("ABb77&*@#@$!!1 !@1 343 *5 Akloti 39489 #$$$% ??/..people", "Hello Jakarta");
	}
}
