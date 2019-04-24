package com.class26;
/*
 * Write program as a student class   that has instance variables name and address.
 *  Create a constructor that will initialize those variables.
 *   Print name & address of given  student by the displayInfo method.
 */

public class Task3 {
	public static void main(String[] args) {
		student st=new student("John", "Snow");
		st.name;
		st.address;
		System.out.println();
	}
}
class student {
	String name, address;

	student(String a, String b) {
	}
	void displayInfo() {
		name="John";
		address="Fairfax";
	}
}
