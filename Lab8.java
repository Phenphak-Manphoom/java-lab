package com.cmd.test;

public class Lab8 {
	public static void main(String[] args) {
		System.out.println("--------------ข้อ1----------------");
		array2();
		System.out.println("--------------ข้อ2----------------");
		arrayPlus();
	}

	// 1
	public static void array2() {
		int[][] twoD_Array = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9 } };
		for (int[] row : twoD_Array) {
			for (int element : row) {
				System.out.println(element);
			}
		}
	}

	// 2
	public static void arrayPlus() {
		int[][] twoD_Array = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9 } };

		for (int[] row : twoD_Array) {
			for (int element : row) {
				System.out.println(element);

			}

		}

		int sum = twoD_Array[0][2] + twoD_Array[1][3] + twoD_Array[2][1];
		System.out.println(twoD_Array[0][2] + "+" + twoD_Array[1][3] + "+" + twoD_Array[2][1] + "=" + sum);

	}
}
