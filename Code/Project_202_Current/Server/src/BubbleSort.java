package multiplayergameServer;

import java.util.ArrayList;

public class BubbleSort implements SortingStrategy
{
	public ArrayList<Integer> sort(ArrayList<Integer> list)
    {
        for(int i = list.size()-1; i >= 0; i--) 
        {
            for(int j = 0; j < i; j++) 
            {
                if(list.get(j) > list.get(j + 1)) 
                {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        
        return list;
    }
}
