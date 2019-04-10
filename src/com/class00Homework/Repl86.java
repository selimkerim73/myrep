package com.class00Homework;

public class Repl86 {

	public static void main(String[] args) {
		/*
		 * For you to do Multiple Parameters for method create three method with
		 * Multiple Parameters as int and write the logic in that method to perform
		 * multiplication,addition and subtraction and call the method in main method
		 * with values
		 * 
		 * 1. for the addition method add two numbers to make 30 but put those numbers
		 * in the parameters 2. for multiplication multiply two numbers to make 30 but
		 * put those two numbers in your parameters 3. for Subtraction subtract two
		 * numbers to equal 20, with using parameters. 30 for addition 30 for
		 * multiplication 20 for subtraction
		 */

		Repl86 opr = new Repl86();
		opr.add(20, 10);
		opr.mult(5, 6);
		opr.sub(30, 10);

	}

	void add(int x, int y) {
		System.out.println(x + y);

	}

	void sub(int x, int y) {
		System.out.println(x - y);
	}

	void mult(int x, int y) {
		System.out.println(x * y);

	}

}
