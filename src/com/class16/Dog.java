package com.class16;

public class Dog {
	/*
	 * Create a Dog Class and create 3 different objects of it: 
	 * Husky, Bulldog, Labrador  with specific  attributes and behaviours.
	 */
	
	String breed, color;
	int age;
	
    public static void main(String[] args) {
    	
		System.out.println("---------------------First Object----------------------");

    	
    	Dog dog1=new Dog();
    	dog1.breed="Husky";
    	dog1.color="White";
    	dog1.age=1;
    	
    	dog1.bark();
    	dog1.hunt();
    	dog1.fun();
    	
		System.out.println("---------------------Second Object----------------------");
		
		Dog dog2=new Dog();
		dog2.breed="Labrador";
		dog2.color="Black";
		dog2.age=1;
    	
		dog2.bark();
		dog2.hunt();
		dog2.fun();
		
		System.out.println("---------------------Third Object----------------------");
		
		Dog dog3=new Dog();
		dog3.breed="Bulldog";
		dog3.color="Gray";
		dog3.age=1;
    	
		dog3.bark();
		dog3.hunt();
		dog3.fun();



}
    void bark() {
    	System.out.println("My dog "+breed+" can bark");
    }
    void hunt() {
    	System.out.println("My dog "+breed+" can hunt");

    }
    void fun() {
    	System.out.println("My dog "+breed+" can fun");

    }
}
