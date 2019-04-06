package com.class17_2;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Print the following pattern: 1 12 123 1234 12345
		 */

		Task3 obj = new Task3();
		obj.printNumbers();

	}

	void printNumbers() {
		for (int a = 1; a < 6; a++) {
			for (int b = 1; b <= a; b++) {

				System.out.print(b);
			}
			System.out.println();
		}

	}

}
