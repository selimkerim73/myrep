package com.class21;
/*
 * Create a Class called Employee:
Create three  variables  eID , salary and set the CEO to “Sumair”
Create two objects of the class Employee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects
 */

public class Employee {
	static String CEO = "Sumair";
	int salary;
	int eID;

	public static void main(String[] args) {

		Employee obj1 = new Employee();
		Employee obj2 = new Employee();

		obj1.salary = 100;
		obj1.eID = 1;

		obj2.salary = 200;
		obj2.eID = 2;

		System.out.println(obj1.salary + obj1.eID + obj1.CEO);

		System.out.println(obj2.salary + obj2.eID + obj2.CEO);

	}

}
