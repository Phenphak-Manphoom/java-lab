package com.cmd.test;

public class Lab5 {
	public static void main(String[] args) {
		System.out.println(returnType(20, 12));
		noReturn();

	}

	public static int returnType(int a, int b) {
		return a + b;

	}

	public static void noReturn() {
		System.out.println("Hello");
	}

}
