package com.cmd.test.Lab14;

public class Programmer extends Employee {

public Programmer(String firstnameInput, String lastnameInput, int salaryInput) {
		super(firstnameInput, lastnameInput, salaryInput);
		// TODO Auto-generated constructor stub
	}

	public Programmer(String firstnameInput, int salaryInput) {
		this(firstnameInput, "", salaryInput);
	}

	

	public void hello() {
		System.out.println("Hello " + firstname);
	}

	public void createWebsite(String template, String titleName) {

	}

	public void installWindows(String version, String productKey) {

	}

}
