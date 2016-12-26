/**********************************************************************
* AUTHOR: Curtis Spears
* COURSE: CS 113 Data Structures & Algorithms
* SECTION: Mon/Wed 11 - 12:50 PM 
* LAB #: 16
* LAST MODIFIED: 11/19/2016
***********************************************************************
* TITLE:				Main : tester class for Sort class methods
* PROGRAM DESCRIPTION:  Main : tests radix sort method on Integers
***********************************************************************/
package edu.miracosta.cs113;

public class Main {

	public static void main(String[] args) {
		
		//create unsorted int[] array
		int[] numbers = {100000, 440, 5124, 8345, 1902, 100, 15553, 20, 921, 36, 1, 75435, 323, 6, 5, 535, 124, 2, 62, 654,12, 381, 673, 902};
		//create sorted version of numbers array
		System.out.println("Radix Sort Passes\n");
		int[] sorted = Sort.radix(numbers);
		
		//output sorted array
		System.out.println("\n\nSorted");
		for(int num : sorted) {
			System.out.println(num);
		}
		
	}

}