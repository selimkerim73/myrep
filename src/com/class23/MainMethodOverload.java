package com.class23;

public class MainMethodOverload {
	
	//normalde bir class in icinde birden fazla main  metod calismaz ama baska main metotlar farkli parametre 
	// degerlerine sahipse calisabilir

	public static void main(String[] args) {
		System.out.println("I am main method with string argument array");
	}

	public static void main() {
		System.out.println("I am main method with no parameters");
	}

	public static void main(String args) {
		System.out.println("I am main method with String parameters");
	}

	public static void main(int a) {
		System.out.println("I am main method with int parameters");
	}
}
