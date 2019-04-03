package com.class11;

public class Task2Darray2 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array that first row will contain 4 names and 
		 * second row will contain grades. 
		 * Then you program should print name of the students that has as an A and B grade
		 */
		
		 String[][] grades= {
	                {"Ahmet",    "Bahri",    "Ceyhun",    "Dilek"},
	                {"A",        "B",         "C",         "D"},
	                };

		 System.out.println(grades[0][0]+" "+grades[1][0]);
		 System.out.println(grades[0][1]+" "+grades[1][1]);
		 System.out.println(grades[0][2]+" "+grades[1][2]);
		 System.out.println(grades[0][3]+" "+grades[1][3]);
	}

}
