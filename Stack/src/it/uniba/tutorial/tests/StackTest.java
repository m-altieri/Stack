package it.uniba.tutorial.tests;

import java.util.EmptyStackException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import it.uniba.tutorial.Stack;
import junit.framework.Assert;

public class StackTest {

	Stack myStack;
	
	@Before
	public void setUp() throws Exception {
		myStack = new Stack();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void addingTheFirstElementHasSizeOne() {
		myStack.push(3);
		Assert.assertEquals(1, myStack.size());
	}
	
	@Test
	public void removingTheOnlyElementHasSizeZero() throws Exception {
		myStack.push(3);
		myStack.pop();
		Assert.assertEquals(0, myStack.size());
	}

}
