/**********************************************************************
* AUTHOR: Curtis Spears
* COURSE: CS 113 Data Structures & Algorithms
* SECTION: Mon/Wed 11 - 12:50 PM 
* HOMEWORK #: Homework 3
* PROJECT #: Project 2
* LAST MODIFIED: 9/17/16 9:00PM
***********************************************************************
* TITLE:				Main
* PROGRAM DESCRIPTION:	Main/tester class for CombinePolynomial and Term
***********************************************************************/

package edu.miracosta.cs113;

import java.util.ArrayList;

public class Main 
{
	public static void main(String[] args) 
	{
		//Declaration/Initialization of ArraList
		ArrayList<Term> test1 = new ArrayList<Term>(10);
		ArrayList<Term> test2 = new ArrayList<Term>(10);
		
		//Fill list 
		for(int i = 0; i < 10; i++)
		{
			test1.add(new Term(i+1, i+1));
			test2.add(new Term(i+5, i+1));
		}
		//Add outlier 
		test1.add(new Term(14, 14));
		
		//Before Implementation of CombinePolynomial Methods
		System.out.println("BEFORE:\t" + test1 + "\n\n      \t" + test2);
		
		//Implementation of Method and Output of Result
		System.out.println("\n\nAFTER::\t" + CombinePolynomial.combine(test1, test2));
		
	}
}
