package com.class14;

public class GroupTask {

	public static void main(String[] args) {
		/*
		 * 1. Write a program to swap 2 numbers without a temporary variable? Swap 2
		 * strings without a temporary variable? a=5; b=10;
		 * 
		 * 2.Write a java program to find the second largest number in the array?
		 * Maximum and minimum number in the array?
		 * 
		 * 3. Find out how many alpha characters present in a string?
		 * 
		 * 4.How to find out the part of the string from a string? What is substring?
		 * Find number of words in string?
		 * 
		 * 5. Write a java program to reverse String? Reverse a string word by word?
		 */

		System.out.println("-------------answer for question 1---------------------------------------");
		int a = 10;
		int b = 5;
		System.out.println("Before Swap:" + " a = " + a + ", b = " + b + "\n");
		// Code to swap 'a' and 'b'
		a = a * b; // a becomes 50
		b = a / b; // b becomes 10
		a = a / b; // a becomes 5

		System.out.println("After Swap:" + " a = " + a + ", b = " + b);
		System.out.println();

		String c = "Hussain";
		String d = "Ahmad";

		// Print String before swapping
		System.out.println("Strings before swap: c = " + c + " and d = " + d + "\n");

		c = c + d;

		d = c.substring(0, c.length() - d.length());

		c = c.substring(d.length());

		System.out.println("Strings after swap: c = " + c + " and d = " + d);

		System.out.println("-------------answer for question 2---------------------------------------");
		int[] num = { 10, 5, 30, 50 };
		int largest = num[0];
		int secondLargest = num[0];
		int max = num[0];
		int min = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > largest) {
				secondLargest = largest;
				largest = num[i];
				for (int e = 0; e < num.length; e++) {
					if (num[i] > max) {
						max = num[i];
						for (int f = 0; f < num.length; f++) {
							if (num[i] < min) {
								min = num[i];
							}
						}
					}
				}
				System.out.println("The second largest number is " + secondLargest);
				System.out.println("The second largest number is " + max);
				System.out.println("The second largest number is " + min);

			}
		}

		System.out.println("-------------answer for question 3--------------------------------------");

		String str = "Welcome To $#^@^@ ^&@ $ !^@^#$ Fairfax 1234";

		String count = str.replaceAll("[^A-Za-z]", "");
		System.out.println(count.length());

		System.out.println("-------------answer for question 5-------------------------------------");
		String str1 = "Today is warm day";
		String reverse = "";

		char[] array = str1.toCharArray();

		for (int i = array.length - 1; i >= 0; i--) {
			reverse = reverse + array[i];
		}

		System.out.println(reverse);

		System.out.println("-------------answer for question 4----------------------------------------");

		String str2 = "We are cool programmers!";

		String subString = str2.substring(7);

		System.out.println("substring 1 :" + subString);

		String subString2 = str2.substring(7, 11);

		System.out.println("substring 1 :" + subString2);

		int splited = str2.split("").length;

		System.out.println("number of words: " + splited);

	}

}
