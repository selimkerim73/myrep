package com.class03;

public class NestedIfAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double gpa=3.6;
		double expectedGpa=3.7;
		boolean hasDiploma=true;
		
		if (hasDiploma) {
			System.out.println("congragilations");
			if (gpa>expectedGpa) {
				System.out.println("You are hired");
				
			}else {
				System.out.println("Unfortunately we cannot hire you");
			}
		}else {
			System.out.println("Please get your degree");
			
			
			   
		}	    
			
		}
				

		
		
		
	}


