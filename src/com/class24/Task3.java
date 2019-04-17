package com.class24;

/*
 * Create 1 class with a private method that has 3 overloaded forms.
 *  Then call each overloaded method with specific arguments and observe result
 */

public class Task3 {
	
	private void task2(String str) {

		System.out.println(str);

	}
	
	private void task2(int i) {

		System.out.println(i);

	}

	private void task2(double i) {

		System.out.println(i);

	}
	public static void main(String[] args) {
		Task3 obj1=new Task3("Hello");
		Task3 obj2=new Task3(5);
		Task3 obj3=new Task3(5.5);
	}
	
	
	
	

}
