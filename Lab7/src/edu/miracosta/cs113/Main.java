package edu.miracosta.cs113;
//import edu.miracosta.cs113.ArrayStack;

public class Main {

	public static void main(String[] args) {
		
		ArrayStack<Integer> stack = new ArrayStack<Integer>();
		
		//isEmpty
		System.out.println("Empty (true): " + stack.empty());
		
		//push
		stack.push(10);
		System.out.println("Empty (false): " + stack.empty());
		
		//peek
		System.out.println(stack.peek());
		
		//pop
		stack.pop();
		System.out.println("Empty (true): " + stack.empty());
		
		//clear test
		stack.clear();
		System.out.println(stack);
		
		//filled constructor test
		//create int array
		for(int i = 0; i < 10; i++) {
			stack.push(i);
		}
		
		System.out.println(stack);
		
	}

}
