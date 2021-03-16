package com.cmd.test;

public class Lab4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----------4.3--------------");
		gradTest();

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

}
