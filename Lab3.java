package com.cmd.test;

public class Lab3 {
	public static void main(String[] args) {
		operat();
		System.out.println("--------------------------------------");
		comparision();

	}

	public static void operat() {
		int i = 20;
		i++;
		i++;
		i++;
		i++;
		i++;
		System.out.println(i);
		i--;
		i--;
		i--;
		i--;
		i--;
		System.out.println(i);

	}

	public static void comparision() {
		float a = 2.1f;
		float b = 3.2f;
		if ((a == 2.1f) && (b == 3.2f))
			System.out.println("a=2.1f and b=3.2f");
		char c = 'H';
		char d = 'D';
		if ((c == 'H') || (d == 'E'))
			System.out.println("c='H' or d='E'");
	}

}
