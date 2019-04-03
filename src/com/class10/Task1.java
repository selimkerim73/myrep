package com.class10;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Create an array of chars and store grades into it: A,B,C,D,E,F.
		 *  Then print a grade B (use 2 different ways of creating an array).
		 */

		char [] array = {'A','B','C','D','E','F'};
		System.out.println(array[1]);
		
		char[] Grade=new char[4];
        Grade[0]='A';
        Grade[1]='B';
        Grade[2]='C';
        Grade[3]='D';
        
        System.out.println(array[1]);
	}

}
