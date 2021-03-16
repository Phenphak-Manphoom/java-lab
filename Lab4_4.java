package com.cmd.test;

public class Lab4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----------4.4--------------");
		whileLoop1();
		whileLoop2();
		whileLoop3();
		foreachLoop();
		doWhileLoop1();
		doWhileLoop2();
		breakWithFor();

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

}
