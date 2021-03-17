package com.cmd.lab10;

public class Main {
	public static void main(String[] args) {
		Employee dang=new Employee("Dang", "Ok", 23000);
		Employee dam=new Employee("Dam", "Dee", 10000);
		Employee[] employees ={dang,dam};
		for(Employee emp :employees) {
			System.out.println(emp.firstname);
			System.out.println(emp.getSalary());
		}

	}

}
