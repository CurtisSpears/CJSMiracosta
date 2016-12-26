/**********************************************************************
* AUTHOR: Curtis Spears
* COURSE: CS 113 Data Structures & Algorithms
* SECTION: Mon/Wed 11 - 12:50 PM 
* LAB # 1
* LAST MODIFIED: 8/29/16 9:00PM
***********************************************************************
* TITLE:				FizzBuzz
* PROGRAM DESCRIPTION:	Outputs numbers 1 - max, if the number is divisible by 
* 						mult1 or mult2 the given String (string1
* 						or string2) will be printed out instead of the number. Prints both 
* 						side by side if divisible by both numbers. 
***********************************************************************/

package edu.miracosta.cs113;

public class Main {

	public static void main(String[] args) {
		
		// Declaration / Initialization
		String string1 = "Fizz";
		String string2 = "Buzz";
		int max = 100; 
		int mult1  = 3;
		int mult2 = 5;
		
		// Begin for loop through 1 - max
		for(int i = 1; i < max + 1; i++)
		{
			//check divisible
			if(i%mult1 == 0 && i%mult2 == 0) //divisible by both - print string1string2
			{
				System.out.println(string1 + "" + string2);
			}
			else if(i%mult1 == 0)  //if divisible by mult1 print string 1
			{
				System.out.println(string1);
			}
			else if(i%mult2 == 0) //if divisible by mult2 print string2
			{
				System.out.println(string2);
			}
			// if not divisible print original number
			else
			{
				System.out.println(i);
			}
		}

	}

}
