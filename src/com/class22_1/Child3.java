package com.class22_1;

public class Child3 extends Parent {
	
	public static void main(String[] args ) {
	
	Child3 childObject=new Child3();
	System.out.println("Child 3 eye color "+childObject.eyeColor);
	System.out.println("Child 3 hair color "+childObject.hairColor);
	System.out.println("Child 3 has "+childObject.nose+" nose");
	
	childObject.sing();
	childObject.canRun();
	
	
	
	}
	public void canRun() {
		System.out.println("Child 3 is can run ");
	}
}
