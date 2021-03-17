package com.cmd.test.Lab15;

public abstract class AbatractTest {
	public int i = 1;

	public abstract void move();

	public abstract void eat();

	public void stand() {
		System.out.println("Stand Still...");
	}

	public static void main(String[] args) {
		
       AbatractTest test =new AbatractTest() {
		
		@Override
		public void move() {
			// TODO Auto-generated method stub
			System.out.println("Move");
		}
		
		@Override
		public void eat() {
			// TODO Auto-generated method stub
			System.out.println("Eat");
		}
		
		
	};
	
	   test.eat();
	   test.stand();
	}
	


}

