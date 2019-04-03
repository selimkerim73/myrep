package com.class10;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create an array of names and store all names of your group. 
		 * Then print your name from that array. (use 2 different ways of creating an array).
		 */
		
		// birinci yol
		String[] a=new String[3];
        a[0]="ahmet";
        a[1]="mehmet";
        a[2]="hasan";
        System.out.println(a[1]);
        
        // ikinci yol        
        String [] array = {"ahmet","mehmet","hasan"};
		System.out.println(array[1]);

	}

}
