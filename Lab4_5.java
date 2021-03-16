package com.cmd.test;

public class Lab4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("-----------4.5--------------");
		continueWithFor();
		continueTest();

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
