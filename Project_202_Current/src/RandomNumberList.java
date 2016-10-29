package multiplayerGameServer;

import org.json.JSONObject;
import java.util.*;

public class RandomNumberList 
{    
    public String getListOfRandomNumber()
    {
        Random randomNumberGenerator = new Random();

	JSONObject obj = new JSONObject();
	int BOUND = 10; //this 10 will come as a variable from database depending on the level

        for(int i = 0; i < 10; i++) 
        {            
	    obj.put("Element " + (i+1), randomNumberGenerator.nextInt(BOUND ));
        }	
	
	return obj.toString();	
    }
}