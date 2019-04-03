package com.class16;

public class Phone {
	
	/*
	 * Create a Class “Phone”. Create 3 Objects of it:
	 * iPhone, Android, Nokia with specific  attributes and behaviours.
	 */
	
	String brand, model;
	int size;
	
    public static void main(String[] args) {
    	
    	Phone phone1=new Phone();
    	phone1.brand="Iphone";
    	phone1.model="Iphone 7";
    	phone1.size=7;
    	
    	phone1.watchMovie();
    	phone1.message();
    	phone1.playMusic();
    	
		System.out.println("-----------Second Object-------");

    	Phone phone2 = new Phone();
    	phone2.brand="Android";
    	phone2.model="Android 5";
    	phone2.size=8;
    	
    	phone2.watchMovie();
    	phone2.message();
    	phone2.playMusic();
    	
		System.out.println("-----------Third Object-------");

    	
    	Phone phone3 = new Phone();
    	phone3.brand="Nokia";
    	phone3.model="Nokia 8";
    	phone3.size=8;
    	
    	phone3.watchMovie();
    	phone3.message();
    	phone3.playMusic();
        
      
    	
    	
    }
    void watchMovie() {
    	System.out.println("We can watch movie on this phone "+brand);
	
    }
    void message () {
    	System.out.println("We can message on this phone "+brand);

    }
    void playMusic() {
    	System.out.println("We can play music on this phone "+brand);

    }
	}
