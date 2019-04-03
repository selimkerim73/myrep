package com.class05;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		/*
		 * write a program to find largest of three double values using if-else...if provided
		 * by a user (numbers must be distinct)
		 */
		
		Scanner scan;
        double largest;
        
        double num1;
        double num2;
        double num3;
        
        
        
        
        scan=new Scanner(System.in);
        System.out.println("Please give the first number");
        num1=scan.nextDouble();
        
        System.out.println("Please give the second number");
        num2=scan.nextDouble();
        
        System.out.println("Please give the third number");
        num3=scan.nextDouble();
        
        if(num1>num2&&num1>num3) {
        	largest=num1;
        	System.out.println("This number is largest"+num1);
        	
        }else if (num2>num1&&num2>num3) {
        	largest=num2;
        	System.out.println("This number is largest"+num2);
        	
        }else if(num3>num1&&num3>num2) {
        	largest=num3;
        	System.out.println("This number is largest "+num3);

        }
        	
        	
        }
        	
        	
        }
        
        
        
        
        
        

	


