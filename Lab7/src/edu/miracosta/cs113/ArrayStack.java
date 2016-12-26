package edu.miracosta.cs113;

//Imports
import java.util.ArrayList;
import java.util.EmptyStackException;


public class ArrayStack<E> {
	
	//Constants
	private static final int INITIAL_CAPACITY = 10;
	
	//Declaration & Initialization
	private int topOfStack = -1; 
	private ArrayList<E> data;
	
	//Constructors
	public ArrayStack() {
		data = new ArrayList<E>(INITIAL_CAPACITY);
	}
	
	//Stack Methods
	public boolean empty() {
		return topOfStack == -1;
	}
	
	public E peek() {
		if(topOfStack > -1 && topOfStack < data.size()) {
			return data.get(topOfStack);
		}
		else {
			throw new EmptyStackException();
		}
	}

	public E pop() {
		if (this.empty() == true) {
			throw new EmptyStackException();
		}
		else {
			E data = this.data.get(topOfStack);
			topOfStack--;
			return data;
		}
	} 
	
	public E push(E obj) {
		this.data.add(++topOfStack, obj); //increment and then method call (++ before variable)
		return obj;
	}
	
	public void clear() {
		this.data.clear();
		topOfStack = -1;
	}
	//Other Methods
	public String toString() {
		return data.toString();
	}
	
}
