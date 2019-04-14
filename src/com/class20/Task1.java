package com.class20;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Create a method createEmail(). Based on provided users name, lastName and
		 * email type, your method should return complete email Address;
		 * johnsnow@gmail.com johnsnow@yahoo.com
		 */
		Task1 obj = new Task1();
		String email = obj.createEmail("John", "Snow", "gmail");
		System.out.println(email.toLowerCase());

	}

	String createEmail (String name, String lastName, String emailType){
		 
		 String email=name+lastName+"@"+emailType+".com";
		 return email;
	 }

}
