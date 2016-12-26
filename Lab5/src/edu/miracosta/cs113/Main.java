package edu.miracosta.cs113;

import java.util.ArrayList;

public class Main 
{
	public static void main(String[] args) 
	{	
		//Declaration & Initialization
		int numberAddedToArray = 15;
		ArrayList<String> testList = new ArrayList<String>(numberAddedToArray);
		
		//Fill ArrayList
		for(int i = 0; i < numberAddedToArray; i++)
		{
			if(i % 2 == 0)
			{
				testList.add("Ofege");
			}
			else
			{
				testList.add("SoulsOfMischief");
			}
		} 
		
		//Print List BEFORE method
		System.out.println("BEFORE: Size(" + testList.size() + ")\n\t" + testList.toString());
		
		//Implement Method
		Exercise1.replace(testList, "Ofege", "FelaKuti");
		//Print List AFTER methods
		System.out.println("AFTER:  Size(" + testList.size() + ")\n\t" + testList.toString());
		
		//Implement Method
		Exercise1.delete(testList, "SoulsOfMischief");
		//Print List AFTER method
		System.out.println("AFTER:  Size(" + testList.size() + ")\n\t" + testList.toString());
			
	}

}
