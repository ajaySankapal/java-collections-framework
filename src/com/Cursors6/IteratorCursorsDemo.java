package com.Cursors6;
import java.util.*;
import java.io.*;

public class IteratorCursorsDemo {

	public static void main(String[] args) {
		ArrayList<Integer> data = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter elements: ");
		for(int i = 0; i<9;i++) {
			Integer element = s.nextInt();
			data.add(element);
		}
		System.out.println(data);
		Iterator itr = data.iterator();
		while(itr.hasNext()) {
			Integer i = (Integer)itr.next();
			if(i%3==0) {
				System.out.print(i+" ");
			}
		}

	}

}
