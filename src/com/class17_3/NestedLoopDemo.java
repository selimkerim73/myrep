package com.class17_3;

public class NestedLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NestedLoopDemo demo = new NestedLoopDemo();
		demo.printNumbers();

	}

	void printNumbers() {
		for (int i = 1; i <= 3; i++) {
			for (int y = 1; y <= 3; y++) {
				System.out.println(i + " " + y);

			}
		}
	}

}
