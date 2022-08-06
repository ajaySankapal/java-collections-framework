package com.Vector4;

import java.util.Vector;

public class VectorDemo {
	public static void main(String args[]) {
		Vector v = new Vector();//default size 10
		//when default vector is full new vector of size double is created
		Vector vec = new Vector(60); // providing the size byself
		Vector vec1 = new Vector(100,5);// initial size and the incremental value 
//		Vector vec2 = new Vector(Collection c);   //equivalent vector of the passed collection
		v.add(10);
		v.addElement("hello");
		v.add(true);
		System.out.println(v);
		v.remove(2);
		System.out.println(v);
		//get
		v.get(0);
		v.firstElement();
		v.lastElement();
		v.elementAt(0);
		
		//size() ---> element in the vector
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		//capacity() ----> capacity of the vector how many element can be filled
		
		
		
		
		
		
		
		//diff b/w ArrayList and Vector
		
		// Arraylist are not synchronized. Not thread safe
		//performance is relatively high
		
		//vectors method are synchronized. Thread safe
		//performance is low
	}

}
