package com.class24;

/*
 * Create a class named ‘Programming’. 
 * While creating an object of the class, if nothing is passed to it, 
 * then the message “I love programming languages” should be printed.
 *  If some String is passed to it, then in place of “programming languages” 
 *  the value variable should be printed. Example, if we pass “Java”, 
 *  then “I love Java” should be printed.
 */

public class Programming {
	String name;

	Programming() {
		System.out.println("I love programming languages");

	}

	Programming(String str) {
		name = str;
		System.out.println("I love" + name);

	}

	public static void main(String[] args) {
		Programming obj1 = new Programming();
		Programming obj2 = new Programming(" Java");

	}
}
