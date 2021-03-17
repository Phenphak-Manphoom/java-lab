package com.cmd.lab12;

public class Main {
public static void main(String[]args) {
	
	Employee dang =new Employee("Dang","KKK", 5000,"Ceo");
	System.out.println(dang.firstname);
	System.out.println(dang.getSalary());
	System.out.println(dang.checkPosition());
	
	CEO ceo=new CEO("Dam", "DD",10000,"Ceo");
	System.out.println(ceo.lastname);
	System.out.println(ceo.getSalary());
	
	//ConstractorOverloading
	Programmer programmer =new Programmer("Somchai",50000);
	System.out.println(programmer.getSalary());
	
}
}
