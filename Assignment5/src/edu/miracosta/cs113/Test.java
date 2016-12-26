package edu.miracosta.cs113;

public class Test {

	//Constants
	private static final int stack1_SIZE = 10;
	
	public static void main(String[] args) {
	
		//LIST STACK TESTS **********************************************
		ListStack<Integer> stack1 = new ListStack<Integer>();
		
		//isEmpty
		System.out.println("Empty (true): " + stack1.isEmpty());
		
		//push
		stack1.push(10);
		System.out.println("Empty (false): " + stack1.isEmpty());
		
		//peek
		System.out.println(stack1);
		
		//pop
		stack1.pop();
		System.out.println("Empty (true): " + stack1.isEmpty());
		
		//clear test
		stack1.clear();
		System.out.println(stack1);
		
		//equals
		//true
		System.out.println("\nFill 2 identical stacks");
		ListStack<Integer> stack2 = new ListStack<Integer>();
		for(int i = 0; i < 10; i++) {
			stack1.push(i);
			stack2.push(i);
		}
		System.out.println(stack1 + "\n" + stack2 + " size: " + stack2.getSize());
		System.out.println("EQUALS (TRUE): " + stack1.equals(stack2));
		//false
		stack1.pop();
		System.out.println("EQUALS (FALSE): " + stack1.equals(stack2));
		
		
		
		//PALINDROME TESTS *********************************************************
		stack1.clear();
		stack2.clear();
		
		//Fill stack1s
		for(int i = 0; i < stack1_SIZE; i++) {
			stack1.push(i);
			stack2.push(i);
		}
		
		//TEST ALGORITHM FOR CHECK PALINDROME METHODS 
		//Palindrome stack1
		String oddPalindrome = "redivider";
		String evenPalindrome = "noon";
		String nonPalindrome = "word";
		ListStack<Character> oddPstack1 = new ListStack<Character>();
		ListStack<Character> evenPstack1 = new ListStack<Character>();
		ListStack<Character> nonPstack1 = new ListStack<Character>();
		
		//Fill Palindrome stack1s
		System.out.println("\nFILL PALINDROME stacks");
		//odd
		for(int i = 0; i < oddPalindrome.length(); i++) {
			oddPstack1.push(oddPalindrome.charAt(i));
		}
		//even
		for(int i = 0; i < evenPalindrome.length(); i++) {
			evenPstack1.push(evenPalindrome.charAt(i));
		}
		//non
		for(int i = 0; i < nonPalindrome.length(); i++) {
			nonPstack1.push(nonPalindrome.charAt(i));
		}
		System.out.println("odd: " + oddPstack1 + "\neven: " + evenPstack1 + "\nnon: " + nonPstack1);
		
		//Check Palindrome
		System.out.println("\nCHECK PALINDOME");
		System.out.println("ODD(TRUE) : " + CheckPalindrome.checkPalindrome(oddPstack1));
		System.out.println("EVEN(TRUE) : " + CheckPalindrome.checkPalindrome(evenPstack1));
		System.out.println("NONE(FALSE) : " + CheckPalindrome.checkPalindrome(nonPstack1));
	
	}
	

}
