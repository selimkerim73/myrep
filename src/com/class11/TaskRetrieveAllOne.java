package com.class11;

public class TaskRetrieveAllOne {

	public static void main(String[] args) {
		/*
		 * Create an array of cars: american cars, german cars, korean cars, italian cars.
		 * Then retrieve all values from that array
		 */
		
		String[][] cars= {
                {"American",    "German",    "Korean",    "Italian"},
                {"Ford",        "BMW",         "Kia",         "Ferrari"},
                };
		
		for (int i=0; i<cars.length; i++) {
			 for (int j=0; j<cars[i].length; j++) {
				 System.out.print(cars[i][j]+" ");
			 }
			 System.out.println();
		}
 
	}

}
