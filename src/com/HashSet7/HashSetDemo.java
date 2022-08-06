package com.HashSet7;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// duplicates are not allowed
		//insertion order is not preserved
		//can add heterogeneous elements
		//we can add null values
		//Implements serializable and cloneable interface
		
		HashSet hs = new HashSet(); // default size 16
		HashSet hs1 = new HashSet(30); //initialize hashset with initial capacity of 30 
		HashSet hs2 = new HashSet(100,.80f);  /// we can also provide load factor. it means when our hashset is filled upto 80% it will build the new hashset with double the capacity of previous hashset
	}

}
