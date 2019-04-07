package com.class00Homework;

public class Main {

	String breed,name,color;

	 public static void main(String[] args){

	   Main dog1 = new Main();

	   dog1.breed="Husky";
	   dog1.name="Tom";
	   dog1.color="brown";

	   Main dog2 = new Main();

	   dog2.breed="Bulldog";
	   dog2.name="Strong";
	   dog2.color="black";

	   Main dog3 = new Main();

	   dog3.breed="Labrador";
	   dog3.name="Cute";
	   dog3.color="white";

	   dog1.bark();
	   dog1.run();
	   dog1.play();

	   dog2.bark();
	   dog2.run();
	   dog2.play();

	   dog3.bark();
	   dog3.run();
	   dog3.play();
	 }


	  void bark(){
	   System.out.println(breed+" can bark");
	 }
	 void run(){
	   System.out.println(breed+" can run");

	 }
	 void play(){
	   System.out.println(breed+" can play");

	 }
	}