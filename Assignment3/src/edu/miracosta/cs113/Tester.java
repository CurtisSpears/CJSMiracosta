/**********************************************************************
* AUTHOR: Curtis Spears
* COURSE: CS 113 Data Structures & Algorithms
* SECTION: Mon/Wed 11 - 12:50 PM 
* HOMEWORK #: Homework 3
* PROJECT #: Project 1
* LAST MODIFIED: 9/17/16 9:00PM
***********************************************************************
* TITLE:				Tester
* PROGRAM DESCRIPTION:	Main/tester class for ArrayListMethods and Student 
***********************************************************************/

package edu.miracosta.cs113;

import java.util.ArrayList;

public class Tester
{
	public static void main(String[] args)
	{
		//Declaration/Initialization
		Student john = new Student("John");
		Student bill = new Student("Bill");
		Student steve = new Student("Steve");
		ArrayList<Student> list = new ArrayList();
		
		//Add ToFront
		list.add(john);
		System.out.println("ORIGINAL LIST: " + list);
		//Second AddToFront
		ArrayListMethods.addToFront(list, bill);
		System.out.println("Add to Front LIST: " + list);
		//AddToEnd
		ArrayListMethods.addToEnd(list, steve);
		System.out.println("Add to End LIST: " + list);
		//Delete 
		ArrayListMethods.remove(list, "Bill");
		System.out.println("Remove LIST (string instance): " + list);	
		
	}

}
