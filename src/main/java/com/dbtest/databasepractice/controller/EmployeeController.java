package com.dbtest.databasepractice.controller;

import java.util.List;

import com.dbtest.databasepractice.model.Employee;
import com.dbtest.databasepractice.service.EmployeeService;
import com.dbtest.databasepractice.serviceimpl.EmployeeServiceImpl;

public class EmployeeController {

	Employee employee;
	EmployeeService employeeService = new EmployeeServiceImpl();

	public boolean insertEmployeeController(int salary, String firstName, String address, String lastName) {
		employee = new Employee(firstName, lastName, address, salary);
		return employeeService.insertEmployeeService(employee);
	}

	public List<Employee> viewAllEmployeeController() {
		return employeeService.viewAllEmployeeService();
	}

	public boolean employeeUpdateController(int id , int salary, String firstName, String address, String lastName) {
		employee = new Employee(firstName, lastName, address, salary);
		employee.setId(id);
		return employeeService.updateEmployeeService(employee);
	}

	public boolean employeeDeleteController(int id) {
		return employeeService.deleteEmployeeService(id);
	}

	public List<Employee> getMaxSalaryController() {
		return employeeService.getMaxSalaryService();
	}

	public List<Employee> getSecondMaxSalaryController() {
		return employeeService.getSecondMaxSalaryService();
	}

	public List<Employee> getMinSalaryController() {
		return employeeService.getMinSalaryService();
	}
	
	public List<Employee> getSpecificEmployeeController(int id) {
		return employeeService.getSpecificEmployeeService(id);
	}
	
	

}
