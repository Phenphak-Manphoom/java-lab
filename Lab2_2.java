package com.cmd.exercise;

public class Lab2_2 {
	public static void main(String[] args) {

		// -------------ข้อ2.2-----------------------------
		bark();
		primativeConvert();
		finall();
		System.out.println("----------------------------");

	}

	// ---------ข้อ2.2---------------
	public static void bark() {
		String dogName = "Pika";
		System.out.println(dogName);
	}

	public static void primativeConvert() {
		float myFloat = 5.5f;
		int myInt = (int) myFloat;
		System.out.println(myInt);

		int newInt = 5;
		float newFloat = newInt;
		System.out.println(newFloat);

		double myDouble = 2.22d;
		float myFloat2 = (float) myDouble;
		System.out.println(myFloat2);

		char myChar = 'H';
		int myInt2 = (int) myChar;
		System.out.println(myInt2);
	}

	public static void finall() {
		final String hello = "Hello";
		// hello="World";
		System.out.println(hello);
	}

}
