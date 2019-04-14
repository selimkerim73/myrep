package com.class23;

public class TaskCalculate {

	public void cal(int a, int b) {
		System.out.println("Method to calculate rectangle "+(a * b));
		System.out.println(a * b);
	}

	public void cal(int a) {
		System.out.println("Method to calculate square "+(a * a));
		System.out.println(a * a);

	}

	public void cal(int a, int b, int c) {
		System.out.println("Method to calculate cube ");
		System.out.println(a * b * c);

	}
}
