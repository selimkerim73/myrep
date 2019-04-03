package com.class05;

import java.util.Scanner;

public class Task2 {

	
	public static void main(String[] args) {
		/*
		 * task 2 
		 * Write a program that will read three inputs of scores (quiz, mid term,
		 * and final scores) and determine the grade based on the following rules:
		 *  if the average score >=90 =>grade=A 
		 *  if the average score >= 70 and <90 => grade=B 
		 *  if the average score>=50 and <70 =>grade=C 
		 *  if the average score<50 =>grade=F
		 */

		Scanner myScanner;
		int quizs;
		int midterms;
		int finals;
		
		myScanner = new Scanner(System.in);
		
		System.out.println("Please enter your quizs score");
		quizs= myScanner.nextInt();
		
		System.out.println("Please enter your midterms score");
		midterms= myScanner.nextInt();
		
		System.out.println("Please enter your midterms finals score");
		finals= myScanner.nextInt();
		
		
		int average=((quizs+midterms+finals)/3);

		if ( average>= 90) {
			System.out.println("GRADE A");

		} else if (average >= 70 && average < 90) {
			System.out.println("GRADE B");

		} else if (average >= 50 && average < 70) {
			System.out.println("GRADE C");

		} else if (average < 50) {
			System.out.println("GRADE C");

		} else {
			System.out.println("NOT VALID TRUE");
		}
	}
}