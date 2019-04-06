package com.class17_3;

public class SquareOutLine {

	public static void main(String[] args) {
		/*
		 *     ******      rows=4,  coilumn=6
		 *     *    *
		 *     *    *
		 *     ******
		 */
		
		SquareOutLine obj= new SquareOutLine();
		obj.printNumbers();
	}
		
		void printNumbers() {
			for (int a=1; a<=4; a++) {
				for (int b=1; b<=6; b++) {
					if (a==1 || a==4 || b==1 || b==6) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
					
					
					
				}
				System.out.println();
					
			}

		

		
			
		}
		
		
}
