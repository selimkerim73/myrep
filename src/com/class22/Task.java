package com.class22;

public class Task {

	/*
	 * 1-Write a program that will have a constructor: one with parameters and
	 * second without any parameters. Create a separate Test class where you will
	 * execute both of the constructors.
	 * 
	 * 2-Write a java program of Class Students that takes students name and 3
	 * subject grades. Inside your class also have a method to Calculate Average
	 * Grade. Test Student class for 5 different students with different marks. Your
	 * program should print an average mark of each students name. NOTE: please make
	 * different names for instance and local variables.
	 * 
	 * 3-Write a program that will have a private default constructor class and
	 * create 2 objects of this class: 1 - inside same class; 2 - from outside the
	 * class.
	 * 
	 * 4-Write program that have static constructor and observe result.
	 */

	String str;

	Task(String str) {
		System.out.println("I am a constructor with 1 parameter " + str);
	}

	Task() {
		System.out.println("I am a constructor without parameter ");
	}

}
