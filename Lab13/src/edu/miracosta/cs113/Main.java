/**********************************************************************
* AUTHOR: Curtis Spears
* COURSE: CS 113 Data Structures & Algorithms
* SECTION: Mon/Wed 11 - 12:50 PM 
* HOMEWORK #: Homework 8
* LAB # 13
* LAST MODIFIED: 11/6/2016
***********************************************************************
* TITLE:				Map storing individual word count from file
* PROGRAM DESCRIPTION: Main driver to create Map storing individual word count from file
***********************************************************************/
package edu.miracosta.cs113;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//Declaration & Initialization
		//input
		String fileName = "Text.txt";
		Scanner scanner = null;
		try {
			scanner = new Scanner(new FileInputStream(fileName));
		} 
		catch (FileNotFoundException fnfE) {
			fnfE.printStackTrace();
		}	
		//create map (anon method)
		HashMap<String, Integer> wordMap = new HashMap<String, Integer>() {
			/** buildWordCounts: adds individual word count to map, also returns map
			 * @param  Scanner scan //scanner taking in separate words
			 * @return HashMap<String, Integer> this (after fill) 
			 */
			public HashMap<String, Integer> buildWordCounts(Scanner scan) {
				String token;
				Integer numOccured;
				while(scan.hasNext()) { //scan through file
					token = scan.next().toLowerCase(); //case doesn't matter for word count
					numOccured = this.get(token); //check if word is re-occurring
					if(numOccured == null) { //not in map curently
						numOccured = 0;
					}
					this.put(token, ++numOccured); //increment and add
				}
				return this; 
			}
		}.buildWordCounts(scanner); //only way to call anonymous method, must be done immediately to avoid loss
		//done for sake of anonymous practice and since lab doesn't reuse method - avoid creating map class separate - keeps everything in main
		
		//Output filled map
		System.out.println(wordMap);	

	}

}
