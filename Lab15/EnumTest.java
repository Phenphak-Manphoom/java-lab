package com.cmd.test.Lab15;

public enum EnumTest {
	Green, Yellow, Red;
	
	public static void main(String[]args) {
		EnumTest test =EnumTest.Green;
		if(test ==EnumTest.Green) {
			System.out.println("Go");
		}else if (test == EnumTest.Yellow) {
			System.out.println("Prepare to stop");
		}else if (test==EnumTest.Red) {
			System.out.println("Stop!!!");
		}else {
			System.out.println("Error");
		}
	}

}
