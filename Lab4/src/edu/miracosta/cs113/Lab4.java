/**********************************************************************
* AUTHOR: Curtis Spears
* COURSE: CS 113 Data Structures & Algorithms
* SECTION: Mon/Wed 11 - 12:50 PM 
* LAB #: 4
* LAST MODIFIED: 9/2/16 9:00PM
***********************************************************************
* TITLE:				Lab4
* PROGRAM DESCRIPTION:	Lab4 shows exponential growth
***********************************************************************/

/* Homework Question: I am not surprised that y2 grows so much faster than y1. 
					  there is a reason we use the term "grows exponentially bigger".
					  I have experience with this in previous math courses so I have 
					  seen how fast exponentials grow compared to other functions. */

package edu.miracosta.cs113;

public class Lab4 {

	public static void main(String[] args) {
		
		//Declaration/Initialization
		int n, y1, y2; 
		
		//Calculation 1
		n = 10;
		y1 = 100 * n + 10;
		y2 = 5 * n * n + 2;	
		System.out.printf("y1: " + y1 + "     y2: " + y2);
		
		//Calculation 2
		n = 100;
		y1 = 100 * n + 10;
		y2 = 5 * n * n + 2;	
		System.out.printf("\n\ny1: " + y1 + "     y2: " + y2);
		
		//Calculation 3
		n = 10000;
		y1 = 100 * n + 10;
		y2 = 5 * n * n + 2;	
		System.out.printf("\n\ny1: " + y1 + "     y2: " + y2);
	}
}
