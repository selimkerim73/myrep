package com.class15;

import java.util.Scanner;

public class InterviewQuestion1 {

	public static void main(String[] args) {
		/*
		 * Write a Java Program to find whether a String is palindrome or not?
		 * (dad, mom, madam)
		 */

		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter any word to check if it a palidrome!");
		String word=scan.nextLine();
		
		String reverse="";
		
		for (int i=word.length()-1; i>=0; i--) {
			reverse+=word.charAt(i);
		}
		
		if (word.equalsIgnoreCase(reverse)) {
			System.out.println("The word is palidrome ");
		}else {
			System.out.println("The word is not a palidrome");
		}
		
	}

}
