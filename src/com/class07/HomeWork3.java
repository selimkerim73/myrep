package com.class07;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		/*
		 * Ask user to pay for a soda
		keep asking user to pay for soda until entered price is not equal to 1.99
		after user got a right amount print "Please enjoy your soda"
		 */

		Scanner scan;
		double price;
		
		scan=new Scanner(System.in);
		
		do {
			System.out.println("Please pay for soda");
			price=scan.nextDouble();
			System.out.println("I am inside of loop");
		} while (price!=1.99);
		System.out.println("Please enjoy your soda");
	
		
	}

}
