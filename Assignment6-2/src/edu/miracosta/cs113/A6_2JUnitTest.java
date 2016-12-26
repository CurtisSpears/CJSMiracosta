/**********************************************************************
* AUTHOR: Curtis Spears
* COURSE: CS 113 Data Structures & Algorithms
* SECTION: Mon/Wed 11 - 12:50 PM 
* HOMEWORK #: Homework 6
* PROJECT #: Project 2
* LAST MODIFIED: 10/09/16 10:00PM
***********************************************************************
* TITLE:				A6_2JUnitTest
* PROGRAM DESCRIPTION: JUnit for ChangeDispenser
***********************************************************************/
package edu.miracosta.cs113;

//Imports *********************
//junit
import org.junit.Assert;
import org.junit.Test;

public class A6_2JUnitTest {
	
	@Test
	public void testDollar() {
		ChangeDispenser dispenser = new ChangeDispenser();
		int[] denoms = {1, 5, 10, 25};
		Assert.assertEquals(242, dispenser.findAllSolutions(100, denoms));
	}
	
	@Test
	public void testQuarter() {
		ChangeDispenser dispenser = new ChangeDispenser();
		int[] denoms = {1, 5, 10, 25};
		Assert.assertEquals(13, dispenser.findAllSolutions(25, denoms));
	}
	
	@Test
	public void testDime() {
		ChangeDispenser dispenser = new ChangeDispenser();
		int[] denoms = {1, 5, 10, 25};
		Assert.assertEquals(4, dispenser.findAllSolutions(10, denoms));
	}
	
	@Test
	public void testPenny() {
		ChangeDispenser dispenser = new ChangeDispenser();
		int[] denoms = {1, 5, 10, 25};
		Assert.assertEquals(1, dispenser.findAllSolutions(1, denoms));
	}
	
}
