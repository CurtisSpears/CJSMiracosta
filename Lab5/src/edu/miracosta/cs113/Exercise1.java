package edu.miracosta.cs113;

import java.util.ArrayList;

public class Exercise1 {

	public static void replace(ArrayList<String> aList, String oldItem, String newItem)
	{
		for(int i = 0; i < aList.size(); i++) //traverses array
		{
			if(aList.get(i).equals(oldItem)) //checks equality 
			{
				aList.set(i, newItem); //replaces oldItem with new item at index
			}
		}
		
	}
	
	 /** Deletes the first occurrence of target in aList. */
	//Remove deleted first entirely to remove all instances, else deletes all instances
	public static void delete(ArrayList<String> aList, String target)
	{	
		boolean deletedFirst = false;
		
		for(int i = 0; i < aList.size() && deletedFirst == false; i++)
		{
			if(aList.get(i).equals(target))
			{
				aList.remove(i);
				deletedFirst = true;
			}
		}
	}
}
