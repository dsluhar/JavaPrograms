package AutomationScripts;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class SetPractice01 {

	public static void main(String[] args) {
		
		Set<Integer> DLSet1 = new HashSet<>();
		
		DLSet1.add(20);
		DLSet1.add(505);
		DLSet1.add(207);
		DLSet1.add(250);
		DLSet1.add(250);
		DLSet1.add(220);
		DLSet1.add(null);
		DLSet1.add(null);
		
//		for (Integer sv : DLSet1) {
//			System.out.println(sv);
//		}
//		
		Iterator<Integer> it = DLSet1.iterator();
				
		while (it.hasNext()){
			System.out.println(it.next());
			
		}
	}

}
