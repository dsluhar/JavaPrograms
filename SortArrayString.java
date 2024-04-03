package AutomationScripts;

import java.util.Arrays;

public class SortArrayString {

	public static void main(String[] args) {
		
		String[] OutDoorGames = {"Squash","Football","VollyBall", "Cricekt","Rugby"};
		
        int size = OutDoorGames.length;

		for (int i=0; i< size-1;i++) 
		{
			for (int j=i+1; j < OutDoorGames.length; j++) {
				if (OutDoorGames[i].compareTo(OutDoorGames[j]) >0){
					String Temp = OutDoorGames[i];
					OutDoorGames[i]=OutDoorGames[j];
					OutDoorGames[j]=Temp;
				}
			}
		}
		  System.out.print(Arrays.toString(OutDoorGames));
	}
}
