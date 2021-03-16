package com.cmd.test;

public class Lab7 {
	static String string1 = "You and Me";
	static String string2 = " you and me ";

	public static void main(String[] args) {
		System.out.println("--------------ข้อ1----------------");
		compare();
		System.out.println("--------------ข้อ2----------------");
		contain();
		System.out.println("--------------ข้อ3----------------");
		length();
		System.out.println("--------------ข้อ4----------------");
		subString();
		System.out.println("--------------ข้อ5----------------");
		trim();
		System.out.println("--------------ข้อ6----------------");
		toUpperCase();
		System.out.println("--------------ข้อ7----------------");
		chainnig();
	}

	// 1
	public static void compare() {

		if (string1.equals(string2)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
	}

	// 2
	public static void contain() {
		String text = "and";
		if (string1.contains(text) && string2.contains(text)) {
			System.out.println(text);
		} else {
			System.out.println("Not Contain");
		}
	}

	// 3
	public static void length() {
		System.out.println(string1.length());
		System.out.println(string2.length());
	}

	// 4

	public static void subString() {
		System.out.println(string1.substring(1, 4));
		System.out.println(string2.substring(1, 4));
	}

	// 5
	public static void trim() {
		System.out.println(string1.trim());
		System.out.println(string2.trim());
	}

	// 6
	public static void toUpperCase() {
		System.out.println(string1.toUpperCase());
		System.out.println(string2.toUpperCase());
	}

	// 7
	public static void chainnig() {
		System.out.println(string2.toUpperCase().trim());
	}

}
