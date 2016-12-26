/**********************************************************************
* AUTHOR: Curtis Spears
* COURSE: CS 113 Data Structures & Algorithms
* SECTION: Mon/Wed 11 - 12:50 PM 
* HOMEWORK #: Homework 8
* LAB # 12
* LAST MODIFIED: 11/6/2016
***********************************************************************
* TITLE:				Main
* PROGRAM DESCRIPTION: Main driver to practice using hash sets and various operations
***********************************************************************/

package edu.miracosta.cs113;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		
		//Question1 1
		System.out.println("Question 1 OUTPUT\n");
		//Declaration / Initialization
		HashSet<Integer> a = new HashSet<Integer>();
		HashSet<Integer> b = new HashSet<Integer>();
		HashSet<Integer> c = new HashSet<Integer>();
		
		//Add to sets
		//a
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		//b
		b.add(5);
		b.add(3);
		b.add(6);
		b.add(7);
		b.add(10);
		
		//Output 
		System.out.println("Set a: " + a);
		System.out.println("Set b: " + b);
		System.out.println("Set c: " + c);
		
		//c = (a U b)
		c.addAll(a);
		c.addAll(b);
		System.out.println("\n\na U b: " + c);
		
		//c = (a n b)
		c.clear(); //reset c
		//get all from a
		c.addAll(a);
		c.retainAll(b); 
		System.out.println("a n b: " + c);
		
		//c = a - b
		c.clear(); //reset
		c.addAll(a);
		c.removeAll(b);
		System.out.println("a - b: " + c);
		
		// if a [  b
		//	c=a
		//else c = b
		c.clear();
		if(a.containsAll(b)) {
			c .addAll(a);
		}
		else {
			c.addAll(b);
		}
		System.out.println("if (a [ b) c = a else c= b: " + c);
		
		//Question 2
		System.out.println("\n\nQuestion 2 OUTPUT\n");
		SetToString set = new SetToString();
		set.addAll(4);
		set.addAll(5);
		System.out.println(set);
	}
	
}




