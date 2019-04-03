package com.class12;

public class ForEachForIn2D {

	public static void main(String[] args) {
		/*
		 * Create a grocery list: fruits, veggies, dairy
		 * then retrieve all values using 2 different loops
		 */

		String [][] gro= {
				{"Apple", "Banana", "Pear"},
				{"Onion","Tomato", "Potato"},
				{"Yogurt", "Milk", "Ayran"},
				
		};
		for (int i=0; i<gro.length; i++) {
		for (int j=0; j<gro[i].length; j++) {
			System.out.print(gro[i][j]+" , ");
			
		}
		System.out.println();
	}
		System.out.println("--------For each Loop-------");
		for (String[] shop:gro) {
			for(String food:shop) {
				System.out.print(food+",");
			}
			System.out.println();
		}

}
}
