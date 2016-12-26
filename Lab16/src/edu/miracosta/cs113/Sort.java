/**********************************************************************
* AUTHOR: Curtis Spears
* COURSE: CS 113 Data Structures & Algorithms
* SECTION: Mon/Wed 11 - 12:50 PM 
* LAB #: 16
* LAST MODIFIED: 11/19/2016
***********************************************************************
* TITLE:				Sort
* PROGRAM DESCRIPTION:  Sort Lab16: class containing radix sort and helper methods. Sorts using
* 						traversal starting at least significant value, sorts each position
* 						by placing the numbers in a queue containing index representations of 
* 						the current digit.
***********************************************************************/
package edu.miracosta.cs113;

import java.util.LinkedList;
import java.util.Queue;

public class Sort {
	
	//RadixSort **********************************************************************************************************
	/** radix : wrapper method for recursive radix sort method (see for more details)
	 * @param int[] numbers
	 * @return int[] sorted
	 */
	public static int[] radix(int[] numbers) {
		return radix(numbers, 0);
	}
	
	/** radix : recursive sort radix method, digit based int[] sorting method (for more info see Google)
	 * 			implements using queue[] to sore and sort value of each digit
	 * @param int[] numbers
	 * @param int position
	 * @return int[] sorted
	 */
	public static int[] radix(int[] numbers, int position) {
		boolean isSorted = true;  //used in base case
		//queue to store values according to current value at position
		Queue<Integer>[] valuesAtPosition = new LinkedList[10];
		//index based on current digit in num
		int queueIndex; 
		//numbers traversal
		System.out.println("PASS: " + (int)Math.pow(10, position) + "'s place.");
		for(int num : numbers) { 
			//find queue index (digit at current position of num)
			queueIndex = (num % ((int)Math.pow(10, position+1)) / (int)Math.pow(10, position));
			//ensure offer won't be called on null queue
			if(valuesAtPosition[queueIndex] == null) {
				valuesAtPosition[queueIndex] = new LinkedList<Integer>();
			}
			//check if numbers is sorted 
			if(queueIndex > 0) {
				isSorted = false; //hasn't reached greatest significant digit
			}
			valuesAtPosition[queueIndex].offer(num); //add num to queue[] at position
		}
		//base case
		if(isSorted == true) {
			return numbers;
		}
		//else
		//recursive call
		//fill array with queue
		int i = 0;
		//traverse each queue in queue[], set numbers[i] for each integer in queue (sorts by current position)
		for(Queue<Integer> queue : valuesAtPosition) {
			if(queue != null) {
				for(Integer value : queue) {
					numbers[i] = value;
					System.out.println(value);
					i++;
				}
			}
		}
		System.out.println();
		return radix(numbers, ++position);
	}
	
}
