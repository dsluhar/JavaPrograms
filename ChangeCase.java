package AutomationScripts;

import java.util.Arrays;
import java.math.*;

import io.cucumber.java.sl.In;

public class ChangeCase {

	//private static void ChangeCase() {
	ChangeCase() {
		StringBuilder str = new StringBuilder("Tset853e IN DiA") ;
		int n=str.length();
		Boolean flag = null;
		
		System.out.println("OLD String : => " +str);
		for (int i = 0; i < n; i++) {
			char ch = str.charAt(i);
			int asci = (int)ch;
	if(( asci >=65 && asci <=90) || ( asci >=97 && asci <=122)) { 
			if (asci >= 97) flag=false ; else flag=true; //for small letters
			if (flag==true) {  //for Capital Letters
				asci = asci+32;  //convert to small letter
				char dl = (char)asci;
				str.setCharAt(i, dl);
			}
			else { //for small letters
				asci = asci-32;   //covert to Capital letter
				char dl = (char)asci;
				str.setCharAt(i, dl);
			}
	}
		}
		System.out.println("NEW String : => " +str);
	} 

	public static void main(String[] args)
	{
		ChangeCase CC = new ChangeCase();
	}
}