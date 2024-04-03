package AutomationScripts;

public class StringTest {
    
  	public static void main(String[] args) {
   		String s1 = new String("digitalocean");
   		String s2 = new String("DIGITALOCEAN");
   		System.out.println(s2.subSequence(0, 4));
   		System.out.println(s1 = s2);
   		
   		String s3 = new String("abc");
   		String s4 = new String("abc1");
   		System.out.println(s3 = s4); //check value
   		System.out.println(s3 == s4); //check value reference
   		
   		String s1a = "abc-1a";
   		String s2b = new String("abc-2b");
   		s2.intern();
   		System.out.println(s1a == s2b);
   	}
}
