package com.generics1;

import java.util.ArrayList;

//Main objective of generics are:
//To provide type safety(type safe - if it is bound to have a single type of data members)-> like array
//To solve problem related to type casting
//To enable developer to write less redundant code
//


public class Generics {
	public static void main(String args[]) {
		
	String[] strArray = new String[20];
	strArray[0] = "Ajay";
	Employee[] empArr = new Employee[20];
//	strArray[1] = new Employee(); //Type mismatch: cannot convert from Employee to String
	//a string array can only contain only string type element. this is type safety
	// java is a statically typed language ---> each variable and expression data-type already known at the compiled time
	ArrayList l = new ArrayList();  //heterogenous collection of objects
	//we can push any object into this. It is a object type thats why you cant have primitive. 
	//so for int(since it is a primitive) type i have to use Integer class
	l.add("Ajay");
	l.add(new Employee()); //it is not showing any error so we can add this
	//now if we try to retrieve the element
	String name = (String)l.get(0);   ///compile time error --> Type mismatch: cannot convert from Object to String. So to avoid this we hae to do type casting
	
	//what if someone by mistake try to retrieve 0th index by typecasting it with Employee
	Employee emp = (Employee)l.get(0); // not showing the eroor at compile time but will give the run time error. 
	// bcz at 0th index the value is of type string and we are casting it with Employee
	//Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class com.generics.Employee --> error at the runtime
	
	//as a general rule it is better to catch the error at compile time rather than at runtime
	
	// this problem can be handled by using Generics
	
	l.get(1);
	
}
}
