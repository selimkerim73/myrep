package com.class11;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Create an array of cars and store 6 elements into it. Using 2 different loops print 
		 * all values from the array
		 */
		
		//1. way
		String[] cars= {"Honda", "Toyota", "Nissan", "Mercedes", "Reanult", "Ferrari" };
		for (int a=0; a<=5; a++) {
			System.out.println(cars[a]);
		}
		
		//2. way
		for (int b=0; b<=cars.length-1; b++) {
			System.out.println(cars[b]);
		}
		}
		

	}


