package com.class24;

/*
 * Create 1 class with a static method that has 3 overloaded forms.
 *  Then call each overloaded method with specific arguments and observe result.
 */

public class Task2 {

	static void task2(String str) {

		System.out.println(str);

	}

	static void task2(int i) {

		System.out.println(i);

	}

	static void task2(double i) {

		System.out.println(i);

	}

	public static void main(String[] args) {
		task2("Hello");
		task2(5);
		task2(5.5);
	}
}