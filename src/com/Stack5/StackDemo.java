package com.Stack5;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// allows duplicate elements
		//insertion order is preserved
		//accepts hetergenous objects
		//based on LIFO- Last in First Out
		Stack s = new Stack();
		s.push(10);
		s.push("hello");
		s.push(true);
		System.out.println(s.pop());
		System.out.println(s);

	}

}
