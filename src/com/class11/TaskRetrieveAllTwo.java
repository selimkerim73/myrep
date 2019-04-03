package com.class11;

public class TaskRetrieveAllTwo {

	public static void main(String[] args) {
		/*
		 * Create an array of countries: north america countries, south america
		 * countries, europe countries, asian countries, african countries. Then print
		 * all values from that array.
		 */

		String[][] cont = { { "USA", "Canada", "Mexico" }, { "Brasil", "Chili", "Bolivia" },
				{ "UK", "French", "Germany" }, { "India", "KOrea", "China" }, { "Sout A.", "Mozambique", "Nijer" }, };
		for (int i = 0; i < cont.length; i++) {
			for (int j = 0; j < cont[i].length; j++) {
				System.out.print(cont[i][j] + " ");

			}
			System.out.println();
		}

		// deneme ornek
		String[][] cities = { { "Fairfax", "vienna" }, { "Raleigh", "Charlotte" }, { "Paterson", "Clifton" }, };
		for (int i = 0; i < cities.length; i++) {
			for (int j = 0; j < cities[i].length; j++) {
				System.out.print(cities[i][j] + " ");
			}
			System.out.println();
		}
		
		//deneme ornek
		
		int[][] nums= {
				{ 1,   2,   3},
				{10,   20, 30},
				{100, 200, 300}, 
		};
		for (int i=0; i<nums.length; i++) {
			for (int j=0; j<nums[i].length; j++) {
				System.out.print(nums[i][j]+" ");
				
			}
			System.out.println();
		}
		//deneme ornek
		
		String[][] teams= {
				{"Fener", "Besiktas", "Galata"},
				{"100",       "200",   "300"}

						};
		for (int i=0; i<teams.length; i++) {
			for (int k=0; k<teams[i].length; k++) {
				System.out.print(teams[i][k]+" ");
				
			}
			System.out.println();
		}
}
}