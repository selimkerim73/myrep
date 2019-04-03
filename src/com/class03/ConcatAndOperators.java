package com.class03;

public class ConcatAndOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		int y = 20;

		String a = "Hello";
		String b = "Bye";

		System.out.println(x + y + a + b);   // 30HelloBy
		System.out.println(x + a + y + b);   // 10Hello20Bye
		System.out.println(x + a + b + y);   // !0HelloBy20
		System.out.println(a + b + x + y);   // HelloBy30; HelloBy1020, won't work
		System.out.println(a + b + (x + y)); // HelloBy30

	}

}
