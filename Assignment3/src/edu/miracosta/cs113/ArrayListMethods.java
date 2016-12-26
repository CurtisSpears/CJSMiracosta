
/**********************************************************************
* AUTHOR: Curtis Spears
* COURSE: CS 113 Data Structures & Algorithms
* SECTION: Mon/Wed 11 - 12:50 PM 
* HOMEWORK #: Homework 3
* PROJECT #: Project 2
* LAST MODIFIED: 9/17/16 9:00PM
***********************************************************************
* TITLE:				ArrayListMethods
* PROGRAM DESCRIPTION:	Contains useful static methods for ArrayList 
***********************************************************************/
package edu.miracosta.cs113;

import java.util.ArrayList;

public class ArrayListMethods 
{
	
	/** addToFront : adds student parameter to front of list parameter
	 * @param ArrayList<Student> list
	 * @param Student student
	 * @return void
	 */
	public static void addToFront(ArrayList<Student> list, Student student)
	{
		list.add(0, student);
	}
	
	
	/** addToEnd : adds student parameter to end of list parameter
	 * @param ArrayList<Student> list
	 * @param Student student
	 * @return void
	 */
	public static void addToEnd(ArrayList<Student> list, Student student)
	{
		if(list.size() > 0)
		{
			list.add(list.size(), student);
		}
		else
		{
			list.add(student);
		}
	}
	
	
	/** remove : Searches for name parameter in list and removes any instances of it
	 * @param ArrayList<Student> list
	 * @param String name
	 */
	public static void remove(ArrayList<Student> list, String name)
	{
		for(int i = 0; i < list.size(); i++)
		{
			if(name.equals(list.get(i).getName()))
			{
				list.remove(i);
			}
		}
	}
}
