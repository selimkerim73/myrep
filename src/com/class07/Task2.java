package com.class07;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create a boolean variable workday and assign true create int variable day
		 * assign it to 1 as long as it is workDay print-->"I need a day of" and
		 * increment day day once day is 6 --> your condition for your loop should
		 * become false
		 */

		boolean workDay = true;
		int day = 1;

		while (workDay) {
			System.out.println("I need a day of");
			if (day == 6) {
				System.out.println("I do not need a day of");

				workDay = false;

			}
			day++;
		}
	}

}
