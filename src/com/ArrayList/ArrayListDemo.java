package com.ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();  //declare empty array with size 10.... constructor without any arguement create arraylist of size 10
		//if all the element got filled a new arraylist of size  [(x*3/2)+1]
		//previous arraylist got discarded by garbage-collector, now you will only have this new arraylist
		ArrayList alist = new ArrayList(30); //constructor with arguement create arraylist of size provided in the arguement
		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(50);
//		ArrayList al1 = new ArrayList(Collection c); // we can also build equivalent arraylist of the collection by using this constructor
		//add method
		al.add("John");
		al.add(21);
		
		//remove method
		//can remove by "object" and by "index"
//		al.remove(21); //i want to remove element 21 but this remove method understand it as index and we get indexoutofbound error
		//so we remove it by making it object
//		al.remove(new Integer(21));
//		
////		al.remove("John");
//		System.out.println(al);
		
		
		// to get the element present at particular index
		  System.out.println(al.get(0));
   
		  //if we kmow that our arraylist will contain only particular type of data then we can use generic, which will avoid type casting error at the runtime
		  ArrayList<Integer> age = new ArrayList<>(); //<T> - generic
		  //this arraylist only contain integer object you cant add any other data type element
		  //we dont need to type cast the elements at the time of retrieval because we already know the data type

	}

}
