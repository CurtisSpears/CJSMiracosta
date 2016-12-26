
/**********************************************************************
* AUTHOR: Curtis Spears
* COURSE: CS 113 Data Structures & Algorithms
* SECTION: Mon/Wed 11 - 12:50 PM 
* HOMEWORK #: Homework 1
* PROJECT #: Project 1
* LAST MODIFIED: 8/29/16 9:00PM
***********************************************************************
* TITLE:				DetectiveJill
* PROGRAM DESCRIPTION:	Driver method, used to solve a murder case using AssistantJack and 
*  						other related classes. Uses basic automated problem solving : increments numbers
*  						until correct, see below for more details. 
***********************************************************************/
package edu.miracosta.cs113;

import java.util.Scanner;

public class DetectiveJill {

	public static void main(String[] args) {
		
		//Declaration
		int answerSet, solution, murder, weapon, location;
		AssistantJack jack;
		//Initialization
		Scanner keyboard = new Scanner(System.in);
		Theory answer = null;
		
		//User Prompt & Input
		System.out.print("Which theory would like you like to test? (1, 2, 3[random]): ");
		answerSet = keyboard.nextInt();
		keyboard.close();
		
		//Initialization
		jack = new AssistantJack(answerSet);
		murder = 1;
		location = 1;
		weapon = 1;
		
		/*Loops until solved (solution = 0), since jack.checkAnswer returns a 1, 2, or 3 based on which
		inputed value is wrong, the value deemed incorrect is incremented until eventually it reaches the correct value */
		do {
			solution = jack.checkAnswer(weapon, location, murder);
			switch (solution){
				case 1 : 
					weapon++;
					break;
				case 2 :
					location++;
					break;
				case 3 : 
					murder++;
					break;
			}
		} while (solution != 0);
		
		//Inputs correct data values into a Theory(see Theory class)
		answer = new Theory(weapon, location, murder);
		
		//Output how many checks it took to come up with correct answer as well as the final solution
		System.out.println("Total Checks = " + jack.getTimesAsked() + ", Solution = " + answer);
		if (jack.getTimesAsked() > 20) {
			System.out.println("FAILED!! You're a horrible Detective...");
		} else {
			System.out.println("WOW! You might as well be called Batman!");
		}

	}
	
}
