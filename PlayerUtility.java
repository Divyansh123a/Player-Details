import java.util.*;
public class PlayerUtility {

	public Player findPlayerDetailsById(Player[] arr, int playerIdToSearch){
	
	//Fill the code here
	Scanner sc = new Scanner(System.in);
	for (int i=0; i<arr.length ;i++ )
	{
	    if(arr[i].getPlayerId()==playerIdToSearch)
	    {
	        return arr[i];
	    }
	}
	return null;
		
	}
	
	
}
