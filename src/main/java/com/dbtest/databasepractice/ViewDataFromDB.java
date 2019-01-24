package com.dbtest.databasepractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dbtest.databasepractice.controller.EmployeeController;
import com.dbtest.databasepractice.model.Employee;

public class ViewDataFromDB {
	
	EmployeeController employeeController = new EmployeeController();
	

	public void employeeAdd() {
		Scanner stringInput = new Scanner(System.in);
		Scanner intInput = new Scanner(System.in);
		System.out.println("Insert employee first name");
		String firstName = stringInput.nextLine();
		System.out.println("Insert employee last name");
		String lastName = stringInput.nextLine();
		System.out.println("Insert employee address");
		String address = stringInput.nextLine();
		System.out.println("Insert Employee Salary");
		int salary = intInput.nextInt();
		boolean insertion = employeeController.insertEmployeeController(salary, firstName, address, lastName);
		if(insertion = false) {
			System.out.println("Insertion failed");
		}
		else {
			System.out.println("Successfully inserted");
		}
		stringInput.close();
		intInput.close();
	}

	public void viewAllEmployee() {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList = employeeController.viewAllEmployeeController();
		System.out.println();
		System.out.println("Employees info is shown below==========");
		System.out.println();
		for(Employee employee:employeeList) {
			System.out.print("Employee Id is "+employee.getId());
			System.out.print("-- Employee first name is "+employee.getFirstName());
			System.out.print("-- Employee last name is "+employee.getLastName());
			System.out.print("-- Employee address is "+employee.getAddress());
			System.out.print("-- Employee salary is "+employee.getSalary());
			System.out.println();
		}

	}

	public void employeeUpdate() {
		
		Scanner stringInput = new Scanner(System.in);
		Scanner intInput = new Scanner(System.in);
		int id = intInput.nextInt();
		String firstName = stringInput.nextLine();
		String lastName = stringInput.nextLine();
		String address = stringInput.nextLine();
		int salary = intInput.nextInt();
		
		employeeController.employeeUpdateController(id, salary, firstName, address, lastName);
		
		
		stringInput.close();
		intInput.close();

	}

	public void employeeDelete() {
		Scanner intInput = new Scanner(System.in);
		int id = intInput.nextInt();
		employeeController.employeeDeleteController(id);
		
		
		
		intInput.close();

	}
	
	public void viewMaxSalary() {
		
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList = employeeController.getMaxSalaryController();
		System.out.println();
		System.out.println("Employees info whose salary is max is shown below==========");
		System.out.println();
		for(Employee employee:employeeList) {
			System.out.print("Employee Id is "+employee.getId());
			System.out.print("-- Employee first name is "+employee.getFirstName());
			System.out.print("-- Employee last name is "+employee.getLastName());
			System.out.print("-- Employee address is "+employee.getAddress());
			System.out.print("-- Employee salary is "+employee.getSalary());
			System.out.println();
		}

	}
	
	public void viewSecondMaxSalary() {
		
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList = employeeController.getSecondMaxSalaryController();
		System.out.println();
		System.out.println("Employees info whose salary is second max is shown below==========");
		System.out.println();
		for(Employee employee:employeeList) {
			System.out.print("Employee Id is "+employee.getId());
			System.out.print("-- Employee first name is "+employee.getFirstName());
			System.out.print("-- Employee last name is "+employee.getLastName());
			System.out.print("-- Employee address is "+employee.getAddress());
			System.out.print("-- Employee salary is "+employee.getSalary());
			System.out.println();
		}

	}
	
	public void viewMinSalary() {
		
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList = employeeController.getMinSalaryController();
		System.out.println();
		System.out.println("Employees info whose salary is minimum is shown below==========");
		System.out.println();
		for(Employee employee:employeeList) {
			System.out.print("Employee Id is "+employee.getId());
			System.out.print("-- Employee first name is "+employee.getFirstName());
			System.out.print("-- Employee last name is "+employee.getLastName());
			System.out.print("-- Employee address is "+employee.getAddress());
			System.out.print("-- Employee salary is "+employee.getSalary());
			System.out.println();
		}

	}
	
	public void viewSpecificEmployee() {
		

	}

}
