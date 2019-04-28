package com.class29;

public interface  Shape {
	
	void calculateArea();
	void calculatePerimiter();

}
class Circle implements Shape{

	@Override
	public void calculateArea() {
		int CircleArea;
		int r=5;
		CircleArea=(int) (3.14*(r*r));
		
		System.out.println("Calculating area of circle "+CircleArea);
		
	}

	@Override
	public void calculatePerimiter() {
		int Perimeter;
		int r=5;
		Perimeter=(int) (2*3.14*5);
		System.out.println("calculating perimeter of circle "+Perimeter);
		
	}
	
}
class Square implements Shape{

	@Override
	public void calculateArea() {
		int SquareArea;
		int a=5;
		SquareArea=a*a;
		System.out.println("Calculating area of square "+SquareArea);
		
	}

	@Override
	public void calculatePerimiter() {
		int Perimeter;
		int a=5;
		Perimeter=4*a;
		System.out.println("Calculating perimeter of square "+Perimeter);
		
	}
	
}