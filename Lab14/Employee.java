package com.cmd.test.Lab14;

public class Employee implements IWebsiteCreator {
	public String firstname;
	public String lastname;
	private int salary;
	

	public Employee(String firstnameInput, String lastnameInput, int salaryInput) {
		firstname = firstnameInput;
		lastname = lastnameInput;
		salary = salaryInput;
		
	}

	public void hello() {
		System.out.println("Hello " + firstname);
	}

	public int getSalary() {
		return salary;
	}



	@Override
	public void createWebsite(String template, String titleName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void orderWebsite(IWebsiteCreator creator) {
		// TODO Auto-generated method stub

	}

}
