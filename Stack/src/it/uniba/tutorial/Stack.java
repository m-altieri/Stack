package it.uniba.tutorial;

import java.util.LinkedList;

public class Stack {
	
	private LinkedList<Integer> stack;
	
	public Stack() {
		
		stack = new LinkedList<Integer>();
	}
	
	public void push(int x) {
		
		stack.add(x);
	}
	
	/**
	 * 
	 * @throws EmptyStackException
	 */
	public void pop() throws EmptyStackException {
		
		if (stack.isEmpty())
			throw new EmptyStackException();
		else
			stack.pop();
	}
	
	/**
	* @return Top element if not empty, throws EmptyStackException otherwise
	* @throws EmptyStackException
	*/
	public int peek() throws EmptyStackException {
		
		return stack.peek();
	}
	
	public int size() {
		
		return stack.size();
	}
	
	public boolean isEmpty() {
		
		return stack.isEmpty();
	}
	

}
