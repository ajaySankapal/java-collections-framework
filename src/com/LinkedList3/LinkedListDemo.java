package com.LinkedList3;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0; i<5;i++) {
			al.add(i);
		}
		int age = 21;
		LinkedList l = new LinkedList();
		LinkedList l1 = new LinkedList(al);
//		System.out.println(((Object)age).getClass().getSimpleName());
		l.add(10);
		l.add("ajay");
		l.add(null);
		System.out.println(l);
		l.set(0, 21);
		l.removeLast();
		System.out.println(l);
		
		//diff b/w ArrayList and LinkedList 
		
		//arraylist- 
		 //not reccomended for insertion and deletion in middle
		 //best choice for retrieving element
		
		//linkedlist-
		 //best choice if frequent operations are insertion and and deletion in middle
		 //not reccomended for retrieval operation
		
		
		

	}

}
