package multiplayergameServer;

//import org.json.JSONObject;
import java.util.*;

public class RandomNumberList
{
	int no;
	NumberModel model;

	public RandomNumberList(NumberModel model)
	{
		this.model = model;
	}

	public void generateRandomNumbers()
	{
		Random randomNumberGenerator = new Random();

		ArrayList<Integer> arrayList = new ArrayList<>();

		// JSONObject obj = new JSONObject();
		int BOUND = 15; // Bound value sets the number of balls

		for (int i = 0; i < BOUND; i++)
		{
			no = randomNumberGenerator.nextInt(98) + 1;

			if (!arrayList.contains(no))
			{
				arrayList.add(no);
			}

			// obj.put("Element " + (i + 1),
			// randomNumberGenerator.nextInt(BOUND));
		}

		Collections.sort(arrayList);

		Integer noArray[] = new Integer[arrayList.size()];
		noArray = arrayList.toArray(noArray);

		model.setNo(arrayList.get(randomNumberGenerator.nextInt(BOUND - 1)));
		model.setNoArray(noArray);

		// obj.put("Elements", arrayList.toArray());
		// obj.put("Number",
		// arrayList.get(randomNumberGenerator.nextInt(BOUND)));

		// return obj.toString();
	}
}