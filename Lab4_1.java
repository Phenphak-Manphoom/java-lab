package com.cmd.test;

public class Lab4_1 {

	public static void main(String[] args) {
		System.out.println("-----------4.1--------------");
		scoreTest();
		handSome();
		System.out.println("-----------4.3--------------");
		gradTest();
		System.out.println("-----------4.4--------------");
		whileLoop1();
		whileLoop2();
		whileLoop3();
		foreachLoop();
		doWhileLoop1();
		doWhileLoop2();
		breakWithFor();
		System.out.println("-----------4.5--------------");
		continueWithFor();
		continueTest();

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

	// 4.3

	public static void gradTest() {
		int grad = 50;
		switch (grad) {
		case 80: {
			System.out.println("A");
			break;
		}
		case 70: {
			System.out.println("B");
			break;
		}
		case 60: {
			System.out.println("c");
			break;
		}
		case 50: {
			System.out.println("D");
			break;
		}
		case 40: {
			System.out.println("F");
			break;
		}
		default:
			System.out.println("E");
		}

	}

	// 4.4
	public static void whileLoop1() {
		int i = 1;
		while (i <= 10) {
			System.out.println("i :" + i);
			i++;
		}
		System.out.println("-----------------------------------------");
	}

	public static void whileLoop2() {
		int i = 1;
		int sum = 0;
		while (i <= 10) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		System.out.println("-----------------------------------------");
	}

	public static void whileLoop3() {
		int i = 1;
		while (i <= 100) {
			if (i % 12 == 0)
				System.out.println(i);
			i++;

		}
		System.out.println("-----------------------------------------");
	}

	public static void foreachLoop() {
		int arr[] = { 1, 2, 3, 4, 5 };
		for (int a : arr) {
			System.out.println(a);
		}
		System.out.println("-----------------------------------------");
	}

	public static void doWhileLoop1() {
		int i = 20;
		do {
			System.out.println(i);
			i--;
		} while (i >= 1);

		System.out.println("-----------------------------------------");
	}

	public static void doWhileLoop2() {
		int i = 1;
		do {
			System.out.println(i);
		} while (i % 2 == 0);

		System.out.println("Odd Number");
		System.out.println("-----------------------------------------");
	}

	public static void breakWithFor() {

		for (int count = 1; count <= 20; count++) {
			if (count == 11) {

				break;
			}
			System.out.println(count);

		}
		System.out.println("11");

		System.out.println("-----------------------------------------");
	}

	// 4.5
	public static void continueWithFor() {
		for (int count = 1; count <= 20; count++) {
			if (count == 11)
				// continue;
				System.out.println("11");

			if (count == 11)
				continue;
			System.out.println(count);

		}

		System.out.println("-----------------------------------------");
	}

	public static void continueTest() {
		for (int i = 1; i <= 10; i++) {
			if (i == 2) {
				continue;
			}
			System.out.println(i);
		}
	}

}
