package com.cmd.lab12;

public class CEO extends Employee{

	public CEO(String firstnameInput, String lastnameInput, int salaryInput,String poStringInput) {
		super(firstnameInput, lastnameInput, salaryInput,poStringInput);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getSalary() {
		return super.getSalary()*2;
		
	}
	
	public void hello() {
	       System.out.println("Hi, nice to meet you. "+this.firstname+"!");
	   }
	public void fire(Employee employee) {
	       	System.out.println(employee.firstname + " has been fired!");
	   	}
	}

   

