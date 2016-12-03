package multiplayergameServer;

import java.util.ArrayList;

public class DataSet
{
	private SortingStrategy sortingStrategy;
	
	public DataSet()
	{
		sortingStrategy = new BubbleSort();
	}
	
	
	public ArrayList<Integer> doSort(ArrayList<Integer> arrayList)
	{
		return sortingStrategy.sort(arrayList);
	}
	
	public void changeStrategy(SortingStrategy sortingStrategy)
	{
		this.sortingStrategy = sortingStrategy; 
	}
}
