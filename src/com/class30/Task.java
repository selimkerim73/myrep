package com.class30;

import java.util.ArrayList;

public class Task {
	/*
	 * Create a generic ArrayList that will store 5 names into it. Find out whether
	 * the given ArrayList is empty or not? Check whether the specific name is
	 * present in an ArrayList or not? Find the size of your arrayList and print all
	 * values from that
	 */

	public static void main(String[] args) {
		ArrayList <String> name=new ArrayList<String>();
		name.add("Joseph");
		name.add("David");
		name.add("Moses");
		name.add("Jesus");
		name.add("Solomon");
		
		System.out.println(name.isEmpty());
		System.out.println(name.contains("Joseph"));
		System.out.println(name.size());
		
		for (String allnames:name) {
			System.out.println(allnames);
		}
		
	}

}
