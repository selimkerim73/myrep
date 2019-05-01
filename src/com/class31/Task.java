package com.class31;
/*
 * Create an array list of cars and retrieve all the values using 4 different ways
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Task {
	public static void main(String[] args) {
		ArrayList <String> cars=new ArrayList<String>();
		cars.add("BMW");
		cars.add("Honda");
		cars.add("Toyota");
		cars.add("Nissan");
		
		// 1. way using for loop
				System.out.println("----------using for loop----------");
				for (int i = 0; i < cars.size(); i++) {
					System.out.println(cars.get(i));
				}
		// 2 way using advanced for loop
				System.out.println("----------using for each loop----------");
				for (Object brands : cars) {
					System.out.println(brands);
				}
		// 3 way using iterator
				System.out.println("----------using iterator----------");
				Iterator<String> it = cars.iterator();
				// hasNext(); next(); remove();
				while (it.hasNext()) {
					// String number=it.next();
					System.out.println(it.next());
				}	
		// 4 way using while loop
				System.out.println("----------using while loop----------");
				int c = 0;

				while (cars.size() > c) {
					String myCars = cars.get(c);
					System.out.println(myCars);
					c++;
				}
}
}

