package com.cmd.lab12;

public class Employee {
	public String firstname;
	public String lastname;
	private int salary;
	private String position;

	public Employee(String firstnameInput, String lastnameInput, int salaryInput,String positionInput) {
		firstname = firstnameInput;
		lastname = lastnameInput;
		salary = salaryInput;
		position =positionInput;
	}

	public void hello() {
		System.out.println("Hello " + firstname);
	}

	public int getSalary() {
		return salary;
	}

	public String checkPosition() {
		return position;
	}
	

}
