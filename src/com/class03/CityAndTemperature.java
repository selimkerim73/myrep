package com.class03;

import java.util.Scanner;

public class CityAndTemperature {
//Ask user to enter city and temperature in Fahreneight
	//your program should convert F-->C
	//your program should say "The temperature in the city ---is ---"
	
	public static void main(String[] args) {
		String cityName;
		int temp;
		
		Scanner myScanner=new Scanner(System.in);
		System.out.println("Please enter your city");
		cityName=myScanner.nextLine();
		
		System.out.println("Please enter tempereature in Fahreneight");
		temp=myScanner.nextInt();
		//formula (F-32)x5/9
		
		int convertedTemp = (temp-32)*5/9;
		System.out.println("The temperature in the city "+cityName+" is "+convertedTemp	);
		
		
	}
	
	

}
