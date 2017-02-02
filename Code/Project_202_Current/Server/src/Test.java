package multiplayergameServer;

public class Test
{

	public static void main(String[] args)
	{
//		NumberModel model = new NumberModel();
//		RandomNumberList list = new RandomNumberList(model);
//		
//		list.generateRandomNumbers();
//		
//		System.out.println(model.getNo());
//		
//		Integer object[] = model.getNoArray();
//		
//		for(int i=0; i<object.length; i++)
//		{
//			System.out.print(object[i] + " ");
//		}
		
		RandomNumberList rn = RandomNumberList.getInstance();
		//rn.generateRandomNumbers();
		System.out.println(rn.getNumberToSearch());
		System.out.println(rn.getRandomNumberList());
	}

}
