package com.class11;

public class Largest {

	public static void main(String[] args) {
		/*
		 * Create an array of integers and find largest number this is interview
		 * question
		 */

		int[] nums = { 2000, 2, 500 };
		int largest = nums[0];

		for (int i = 0; i <= nums.length - 1; i++) {

			if (nums[i] > largest) {
				largest = nums[i];

			}
		}
		

		System.out.println("The largest number is " + largest);
	}

}
