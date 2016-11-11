package multiplayergameServer;

//import org.json.JSONObject;
import java.util.*;

public class RandomNumberList
{
	private int no;
        private ArrayList<Integer> arrayList = new ArrayList<>();

	public RandomNumberList()
	{		
	}

	public void generateRandomNumbers()
	{
            Random randomNumberGenerator = new Random();
            
            int BOUND = 15; // Bound value sets the number of balls

            for (int i = 0; i < BOUND; i++)
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
            generateRandomNumbers();
            return arrayList;        
        }
        
        public int getNumberToSearch()
        {
            return no;
        }
}