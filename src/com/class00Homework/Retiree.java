package com.class00Homework;

class Retiree extends Person{
	  
	  Retiree(){
	     
	    Person prs=new Person();
	    String seniorActivity="tour";
	    prs.name="Frank";
	    prs.age=15;
	 
	    System.out.print(prs.name+" "+prs.lastName+" "+prs.age+" "+seniorActivity);
	    
	  }
}