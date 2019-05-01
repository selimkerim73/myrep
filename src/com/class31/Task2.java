package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
	/*
	 * Create an array list of words. Remove every word that ends with "e". Use
	 * iterator
	 */

	public static void main(String[] args) {

		ArrayList<String> word = new ArrayList<String>();
		word.add("Phone");
		word.add("Elite");
		word.add("Hi");
		word.add("Hello");

		Iterator<String> iterator = word.iterator();
		while (iterator.hasNext()) {
			String word1 = iterator.next();
			if (word1.endsWith("e")) {
				iterator.remove();
			}

		}
System.out.println(word);
	}
}
