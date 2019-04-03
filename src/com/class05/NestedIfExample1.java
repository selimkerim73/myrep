package com.class05;

public class NestedIfExample1 {

	public static void main(String[] args) {
		/*check if user has credit card--> 
		 * check what is the balance if balance is more than !000-->pay off
		 * else "You are good"
		 */
		
		boolean creditCard=true;
		int balance=2000;
		
		if (creditCard) {
			System.out.println("Lets check the balance");
			if(balance>1000) {
				System.out.println("pay off now");
			}else {
				System.out.println("you are good");
			}
		}else {
			System.out.println("Do you want a credit card?");
		}

	}

}
