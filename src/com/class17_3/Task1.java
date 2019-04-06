package com.class17_3;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * 1. Write a program that reads a range of integers (start and end point),
		 * provided by a user and then from that range prints the sum of the even and
		 * odd integers.
		 * 
		 */
		
		Task1 obj=new Task1();
		obj.printNumbers();
		
		
	}
	void printNumbers() {
		Scanner scan;

		int start = 0;
		int end = 10;
		int Sum1 = 0;
		int Sum2 = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your start number");
		start = scanner.nextInt();
		System.out.println("Please enter your end number");
		end = scanner.nextInt();

		for (int a = start; a <= end; a++) {
			if (a % 2 == 0) {
				Sum1 += a;
			} else {
				Sum2 += a;

			}
		}
		System.out.println("The sum of odd numbers " + start + " to " + end + " is " + Sum2);
		System.out.println("The sum of even numbers " + start + " to " + end + " is " + Sum1);

	}
		
	}
		
	

		

