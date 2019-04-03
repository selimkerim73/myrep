package com.class01;

public class ReplIt70 {

	public static void main(String[] args) {
		/*
		 * For you to do:

(the output should be one per line)

		Print out the position of the first occurrence of "c"
		Print out the position of the first occurrence of " "
		Print out the position of the first occurrence of the variable target1
		Print out the position of the first occurrence of the variable target2
		 */
		
		String str="abracadabra alakazam";
		String target1="dab";
		String target2="ABRA";
		
		 char at=str.charAt(4);
		 char at0=str.charAt(11);

		
		 
		 boolean t=target2.contains("ABRA");
		 
		 System.out.println(at);
		 System.out.println(at0);
		 System.out.println(target1.substring(6, 8));
		 System.out.println(t);
		 
		 
		 


		 
	}

}
