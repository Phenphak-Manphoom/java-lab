package com.cmd.test;

public class Lab4_1 {

	public static void main(String[] args) {
		System.out.println("-----------4.1--------------");
		scoreTest();
		handSome();

	}

	// 4.1
	public static void scoreTest() {
		int score = 49;
		if (score >= 80)
			System.out.println("Good");
		else if (score >= 50 && score < 80)
			System.out.println("Normal");
		else
			System.out.println("Fail");
		System.out.println("-----------------------------------------");
	}

	public static void handSome() {
		boolean isHandSome = true;
		int score = 49;
		if (score >= 80 && isHandSome == true)
			System.out.println("Good");
		else if (score >= 50 && score < 80 && isHandSome == true)
			System.out.println("Good");
		else
			System.out.println("Good");

	}

}
