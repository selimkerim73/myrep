package com.class17_3;

public class NestedLoop {

	public static void main(String[] args) {
		NestedLoop demo =new NestedLoop();
		demo.printNumber();
		

	}
	void printNumber() {
		for (int i=0; i<3; i++) {
			System.out.println("-----I am outer loop---- "+i);
			
			for (int y=0; y<3; y++) {
				System.out.println("I am inner loop "+y);

			}
		}

	}

}
