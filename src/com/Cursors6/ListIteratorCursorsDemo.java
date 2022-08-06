package com.Cursors6;

import java.util.*;
import java.io.*;

public class ListIteratorCursorsDemo {

	public static void main(String[] args) {
		// ListIterator is bidirectional iterator we can travel in both the direction.
		//only for list interface objects
		ArrayList<String> data = new ArrayList<>();
		data.add("ramesh");
		data.add("raj");
		data.add("amrish");
		data.add("khushal");
		ListIterator litr = data.listIterator();
		while(litr.hasNext()) {
			String i = (String)litr.next();
			if(i.equals("raj")) {
				data.add("aman");
			}
			if(i.equals("amrish")) {
				data.remove("amrish");
			}
		}
		System.out.println(data);
	}

}
