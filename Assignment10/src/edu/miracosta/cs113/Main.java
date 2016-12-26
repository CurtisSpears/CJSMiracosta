/**********************************************************************
* AUTHOR: Curtis Spears
* COURSE: CS 113 Data Structures & Algorithms
* SECTION: Mon/Wed 11 - 12:50 PM 
* HOMEWORK #: Homework 10
* PROJECT #: Project 1
* LAST MODIFIED: 11/20/2016
***********************************************************************
* TITLE:				Main
* PROGRAM DESCRIPTION:  Main class drives File Sort method and Sort.merge methods
***********************************************************************/

package edu.miracosta.cs113;

public class Main {

	public static void main(String[] args) {
	
		//NOTE: don't call methods in while loop on "Integers.txt" to avoid override original file
		//		can easily be changed by switching 
		//Testing File *************************************************************************************
		//Integers
		String fileIntName = "Integers.txt";
		String outIntFile1 = "SortedInt1.txt";
		String outIntFile2 = "SortedInt2.txt";
		int runSize = 10;
		//Split file into increments of sorted x's and store total number of lines
		FileSort.merge(fileIntName, outIntFile1, outIntFile2, runSize);
		
		//Strings
		//Testing File *************************************************************************************
		String fileStrName = "Names.txt";
		String outStrFile1 = "SortedStr1.txt";
		String outStrFile2 = "SortedStr2.txt";
		runSize = 10;
		//Split file into increments of sorted x's and store total number of lines
		FileSort.merge(fileStrName, outStrFile1, outStrFile2, runSize);
	}		
	
}
