package com.class07;

public class task1 {

	public static void main(String[] args) {
		/*
		 * 1. Declare variable and increase by 100 using shorthand operator
         * 2. Declare variable and decrease by 67 using shorthand operator
         * 3. Declare variable cakePiece=11 and divide cakePiece between 
         * 4 people using shorthand operator
         * each person should get an equal piece of cake
         *
         * 4. Declare variable cakePiece=25 and divide cakePiece between 7 people
         * using shorthand operator found out how many pieces of cake left after
         *  it was distributed equally among 7 people
		 */
		int cakePiece=11;
		
		int a=100;
		a=a+100;
		System.out.println(a);
		
		int b=100;
		b=b-67;
		System.out.println(b);
		
		
		cakePiece=11/4;
		
		System.out.println(cakePiece);
		
		  int cakePieces = 25;
	        cakePieces %= 7;
	        System.out.println("The left over is "+ cakePieces);
	}

}
