package com.class12;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Accept username, password and confirm password and check following requirements:
		Username and Password cannot be  empty, if so→ message=�?Username and Password cannot be empty�?.
		Password should be minimum 8 characters, if less → message=�?Password is too short�?.
		Password cannot contain username if so, → message=�?Password cannot contain username�?.
		Password should match confirmed password, if not  → message “Passwords do not match�?.
		Only after all requirements met → message “Your username and password has been created�?
		 */

		Scanner scan;
		
		
		scan=new Scanner(System.in);
		
		System.out.println("Please enter user name");
		String userName=scan.nextLine();
		
		System.out.println("Please enter password");
		String password=scan.nextLine();
	}

}
