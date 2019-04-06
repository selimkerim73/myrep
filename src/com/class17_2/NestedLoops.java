package com.class17_2;

public class NestedLoops {

	public static void main(String[] args) {
		/*
		 * 12345 12345 12345 12345
		 */
		NestedLoops obj = new NestedLoops();
		obj.printNumbers();

	}

	void printNumbers() {
		/*
		 * I want to print pattern 55555 44444 33333 22222 11111
		 */

		for (int i = 1; i <= 5; i--) {
			for (int y = 1; y >= 5; y++) {
				System.out.print(i);

			}
			System.out.println();

		}

		/*
		 * 1111111 2222222 3333333 4444444 5555555 6666666 7777777
		 */

		for (int i = 1; i <= 7; i++) {
			for (int y = 1; y <= 7; y++) {
				System.out.print(i);

			}
			System.out.println();

		}

		/*
		 * ***** ***** ***** *****
		 */

		for (int a = 0; a < 4; a++) {
			for (int b = 0; b < 5; b++) {
				System.out.print("*");
			}
			System.out.println();
		}

		/*
		 * 54321 54321 54321 54321
		 * 
		 */

		for (int a = 4; a > 0; a--) {
			for (int b = 5; b > 0; b--) {
				System.out.print(b);
			}
			System.out.println();
		}

		// 55555
		// 44444
		// 33333
		// 22222
		// 11111

		/*
		 * * ** *** ****
		 */

		for (int a = 0; a < 4; a++) {
			for (int b = 0; b <= a; b++) {
				System.out.print("*");

			}
			System.out.println();
		}
		/*
		 * ****** * * * * ******
		 */

		for (int a = 1; a <= 4; a++) {
			for (int b = 1; b <= 6; b++) {

				System.out.print("*");

			}
			System.out.println();

		}
	}

}
