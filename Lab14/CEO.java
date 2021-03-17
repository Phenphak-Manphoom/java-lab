package com.cmd.test.Lab14;

public class CEO extends Employee {

	

	public CEO(String firstnameInput, String lastnameInput, int salaryInput) {
		super(firstnameInput, lastnameInput, salaryInput);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getSalary() {
		return super.getSalary() * 2;

	}

	public void hello() {
		System.out.println("Hi, nice to meet you. " + this.firstname + "!");
	}

	public void fire(Employee employee) {
		System.out.println(employee.firstname + " has been fired!");
	}

	public void orderWebsite() {

	}
	
	public void createWebsite(String template, String titleName) {

	}

	public void installWindows(String version, String productKey) {

	}
}
