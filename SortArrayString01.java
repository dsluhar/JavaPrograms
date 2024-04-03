package AutomationScripts;

public class SortArrayString01 extends Object {

	public static void main(String[] args) {

		String[] arr = { "Apple", "Banana", "Orange","Grapes","Pumpkin"};
		
		for(String data : arr) {
			System.out.println(data);
			};
			
		for(int i=0;  i< arr.length;i++) {
			System.out.println(arr[i]);
			};
			
			String key = "Grapes1";
			Boolean flag = false;
			for(int i=0;  i< arr.length;i++) {
				if (arr[i]==key) {
					System.out.println("The index of the kwy is : " +i);
					flag=true;
				}
				}
			if (flag == false) {
				System.out.println("String not found");
			};
			
			   String[][] names = {
			            {"Mr. ","Mrs. ","Ms. "},
			            {"Smith","Jones"}};
			 
			        // Mr. Smith
			        System.out.println(names[0][0] +  names[1][0]);
			        // Ms. Jones
			        System.out.println(names[0][2] +  names[1][1]);
			    }
	}
