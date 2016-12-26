/**********************************************************************
* AUTHOR: Curtis Spears
* COURSE: CS 113 Data Structures & Algorithms
* SECTION: Mon/Wed 11 - 12:50 PM 
* LAB #: 8 
***********************************************************************
* TITLE:				Main
* PROGRAM DESCRIPTION: Main for stack practice 
***********************************************************************/

package edu.miracosta.cs113;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		//Declaration / Initialization
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		Queue<Integer> queue1 = new LinkedList<Integer>();
		boolean validStack = false;
		boolean validQueue = false;
		
		//Fill Stack *******************
		System.out.println("STACK1 FILL");
		//push
		stack1.push(-1);
		stack1.push(15);
		stack1.push(23);
		stack1.push(44);
		stack1.push(4);
		stack1.push(99);
		//output
		System.out.println("stack1 peek:"+ stack1.peek());
		
		
		//Loop fill queue and stack2 using stack (pop) *******************
		System.out.println("\nFILL QUEUE AND STACK2 (POPS STACK1)");
		//fill/pop
		validStack = stack1.isEmpty() == false;
		while(validStack) {
			stack2.push(stack1.peek());
			queue1.offer(stack1.peek());
			stack1.pop();
			validStack = stack1.isEmpty() == false;
		}	
		//output
		System.out.println("stack1: " + stack1 + "\nstack2: " + stack2 + "\nqueue1: " + queue1);
		
		
		//Print stack2 & queue side by side
		System.out.print("\nPRINT STACK & QUEUE SIDE BY SIDE");
		validStack = stack2.isEmpty() == false;
		validQueue = queue1.isEmpty() == false;
		while(validStack || validQueue) {
			if(validStack) {
				System.out.print("\nstack: " + stack2.peek());
				stack2.pop();
			}
			if(validQueue) {
				System.out.print("\tqueue: " + queue1.peek());
				queue1.remove();
			}
			validStack = stack2.isEmpty() == false && stack2.peek() != null;
			validQueue = queue1.isEmpty() == false && queue1.peek() != null;	
		}

	}

}
