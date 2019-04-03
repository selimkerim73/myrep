package com.class12;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Accept username, password and confirm password and check following requirements:
		Username and Password cannot be  empty, if soâ†’ message=â€?Username and Password cannot be emptyâ€?.
		Password should be minimum 8 characters, if less â†’ message=â€?Password is too shortâ€?.
		Password cannot contain username if so, â†’ message=â€?Password cannot contain usernameâ€?.
		Password should match confirmed password, if not  â†’ message â€œPasswords do not matchâ€?.
		Only after all requirements met â†’ message â€œYour username and password has been createdâ€?
		 */

		Scanner scan;
		
		
		scan=new Scanner(System.in);
		
		System.out.println("Please enter user name");
		String userName=scan.nextLine();
		
		System.out.println("Please enter password");
		String password=scan.nextLine();
	}

}
