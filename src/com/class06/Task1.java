package com.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Write a program that prints out if it is good weather to go for any activity
		 * or not If the temperature is between 40 degrees and 80 degrees inclusive & no
		 * rain--> we will go for hiking otherwise--> we will not go hiking If
		 * temperature is between 25 and 40 inclusive & snowing -->going snowboarding
		 * otherwise we are not going snowboarding it if temperature is more than 80 &
		 * sunny--> go to the beach otherwise --> not go to the beach
		 * 
		 */

		Scanner scan;
		boolean snow, raining, sunny;
		int temp;
		boolean rain;

		String activity;
		String weather;

		scan = new Scanner(System.in);

		System.out.println("Please enter a temperature");
		temp = scan.nextInt();

		if (temp >= 40 && temp <= 80) {
			System.out.println("is it raining");
			rain = scan.nextBoolean();
			      if (rain) {
				activity="Watch a movie";
						
			}    else {
				activity="go hiking";
		}
		}      else if(temp>=25 && temp<40) {
			
		}
			
		}

		}
	
