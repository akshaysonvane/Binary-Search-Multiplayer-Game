package multiplayergameServer;

//import org.json.JSONObject;
import java.util.*;

public class RandomNumberList
{
        private int BOUND = 15;
	private int no;
        private ArrayList<Integer> arrayList = new ArrayList<>();
        
        private static RandomNumberList instance = null;

	private RandomNumberList()
	{		
	}
        
        public static RandomNumberList getInstance() 
	{
            if(instance == null) {
                    instance = new RandomNumberList();                        
            }
            return instance;
   	}

	public void generateRandomNumbers()
	{
            arrayList.clear();
            
            Random randomNumberGenerator = new Random();           
             
            while (arrayList.size() < BOUND)
            {
                    no = randomNumberGenerator.nextInt(98) + 1;

                    if (!arrayList.contains(no))
                    {
                            arrayList.add(no);
                    }		
            }

            Collections.sort(arrayList);
            no = arrayList.get(randomNumberGenerator.nextInt(BOUND - 1));
	}
        
        public ArrayList<Integer> getRandomNumberList()
        {            
            return arrayList;        
        }
        
        public int getNumberToSearch()
        {
            return no;
        }
}