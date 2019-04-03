package com.class11;

public class Recap {

	public static void main(String[] args) {
		/*
		 * lets create an array of names that will hold 5 elements and retrieve all values from it
		 */

		//
		String [] names=new String[5];
		names[0]="Asel";
		names[1]="Awet";
		names[2]="Arif";
		names[3]="Weqas";
		names[4]="Dzimitri";
		
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
			
		}
		
		//2.create an array using array literal
		String[] studentNames= {"Shaban", "Bilal", "Mehmet", "Zaki", "Samir", "Frank"};
		for (int i=0; i<=studentNames.length-1; i++) {
			System.out.println(studentNames[i]);
		}
		
		//retrieve values using: advanced for loop, for each loop, enhanced for loop
		// EN KOLAY VE AVANTAJLI YOL ama index ile calismaz!!!
		for (String student:studentNames) {
			System.out.println(student);
		}
		
		
	}

}
