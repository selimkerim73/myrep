package com.class05;

public class LogicalOperators {

	public static void main(String[] args) {
		/*if number is between 11-10--> number is small
		 * is number is between 11-100--> number is medium
		 * if number is between 101-1000--> number is large
		 */
		
		int num=1150;
		if (num>=1 && num <=10) {
			System.out.println("number is small");
			
		}else if (num>=11 && num<=100) {
			System.out.println("number is medium");
		
		}else if (num>=101 && num<=1000) {
			System.out.println("number is large");

	}else {
		System.out.println("Number is not our range");

	}
	}
	}
