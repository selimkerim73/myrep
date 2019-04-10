package com.class20;

public class Student {
	

	public static void main(String[] args) {
		/*Create a class Student that will have a method getGrade
		 * your method should accept the score of a student and return a grade 
		 * score >90 - A
		 * score >80 - B
		 * score >70 - C
		 * score >50 - D
		 * anything else - F
		 */
		
		
		
		
		Student obj=new Student();
		obj.getGrade();
		

	}
	
	
	
	

	String getGrade(int score) {
		
		String grade;
		if (score >=90 && score <=100  ) {
			 grade="A";
		if (score >=80 && score <=90  )
			grade="B";
		if (score >=70 && score <80  )
			grade="C";
		
		return grade;
		
	}
	
	

}
