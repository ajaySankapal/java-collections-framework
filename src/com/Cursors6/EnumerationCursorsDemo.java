package com.Cursors6;

import java.util.Scanner;
import java.util.*;
import java.io.*;
public class EnumerationCursorsDemo {

	public static void main(String[] args) {
		
		//Enumerator .....Enumeration -- only for legacy classes stack and vector
		
		Vector v = new Vector();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter elements");
		for(int i = 0; i<9;i++) {
			Integer element = s.nextInt();
			v.add(element);
			
		}
		System.out.println(v);
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			Integer element = (Integer)e.nextElement();
			if(element %3==0) {
				System.out.print(element+" ");
			}
		}

	}

}
