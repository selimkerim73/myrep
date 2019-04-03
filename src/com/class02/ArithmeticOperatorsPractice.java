package com.class02;

public class ArithmeticOperatorsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double d1 = 2.5;
		double d2 = 7.5;

		double sum = d1 + d2;
		double sub = d2 - d1;
		double mult = d1 * d2;
		double div = d2 / d1;

		System.out.println("The sum of 2 numbers " + d1 + " and " + d2 + " is equal to " + sum + " . ");

		double a = 3.9;
		double sq = a * a;

		System.out.println("The square of the " + a + " is" + sq);

		int c = 5;
		int e = 8;

		int area = c * e;
		int peri = 2 * (c + e);

		System.out.println("The perimeter of a rectangle with width " + c + " and height " + e + " is equal to " + peri
				+ " and the area is " + area);

	}

}
