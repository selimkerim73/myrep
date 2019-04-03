package com.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Task Prompt the user to enter person heights in inches. Person should be
		 * classified as one of the following: short (under 5 feet) medium(5 to 6 feet)
		 * tall (6 feet and over)
		 */

		Scanner myScanner;
		int heights;

		myScanner = new Scanner(System.in);
		System.out.println("Please enter your heights");
		heights = myScanner.nextInt();

		if (heights < 5) {
			System.out.println("short");
		} else if (heights == 5 && heights == 6) {

			System.out.println("medium");

		} else if (heights >= 6) {

			System.out.println("tall");

		} else {

		}

	}

}
