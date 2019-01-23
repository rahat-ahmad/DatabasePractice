package com.dbtest.databasepractice.controller;

import java.util.List;

import com.dbtest.databasepractice.model.Employee;
import com.dbtest.databasepractice.service.EmployeeService;
import com.dbtest.databasepractice.serviceimpl.EmployeeServiceImpl;

public class EmployeeController {

	Employee employee;
	EmployeeService employeeService;

	public boolean insertEmployeeController(int salary, String firstName, String address, String lastName) {
		employee = new Employee(firstName, lastName, address, salary);
		employeeService = new EmployeeServiceImpl();
		return employeeService.insertEmployeeService(employee);

	}

	public List<Employee> viewAllEmployeeController() {
		employeeService = new EmployeeServiceImpl();
		return employeeService.viewAllEmployeeService();
	}

	public boolean employeeUpdateController(int id , int salary, String firstName, String address, String lastName) {
		employee = new Employee(firstName, lastName, address, salary);
		employee.setId(id);
		employeeService = new EmployeeServiceImpl();
		
		return false;
	}

	public boolean employeeDeleteController() {

		return false;
	}

	public List<Employee> getMaxSalaryController() {

		return null;
	}

	public List<Employee> getSecondMaxSalaryController() {

		return null;
	}
	
	public List<Employee> getMinSalaryController() {

		return null;
	}
	
	

}
