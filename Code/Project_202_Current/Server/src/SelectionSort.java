package multiplayergameServer;

import java.util.ArrayList;

public class SelectionSort implements SortingStrategy
{
	private ArrayList<Integer> inputArray = new ArrayList<Integer>();
	
	public ArrayList<Integer> sort(ArrayList<Integer> arrayList)
	{
		this.inputArray.clear();
		this.inputArray = arrayList;
		
		int smallInt = 0;
        int j=0;
        int smallIntIndex = 0;      
         
        for(int i=1;i<inputArray.size();i++){
             
            smallInt = inputArray.get(i-1);
            smallIntIndex = i-1;
             
            for(j=i;j<inputArray.size();j++){
                if(inputArray.get(j)<smallInt){
                    smallInt = inputArray.get(j);
                    smallIntIndex = j;
                }
            }
         
            //Swap the smallest element with the first element of unsorted subarray
            swap(i-1, smallIntIndex);           
        }
        
        
		return inputArray;
	}
	
	public void swap(int sourceIndex,int destIndex)
	{        
        int temp = inputArray.get(destIndex);
        inputArray.set(destIndex, inputArray.get(sourceIndex));
        inputArray.set(sourceIndex, temp);
    }

}
