package com.class03;

public class TemperatureCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int StoreTemp = 31;
		int orig = 32;

		if (StoreTemp < orig) {
			System.out.println("Water will freeze with temperature " + orig);
		} else {
			System.out.println("Water will not freeze with temperature " + StoreTemp);

		}

	}

}
