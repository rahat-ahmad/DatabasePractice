package com.dbtest.databasepractice.service;

import java.util.List;

import com.dbtest.databasepractice.model.Employee;

public interface EmployeeService {
	
	boolean insertEmployeeService(Employee employee);
	List<Employee> viewAllEmployeeService();
	boolean updateEmployeeService(Employee employee);
	boolean deleteEmployeeService(Employee employee); 
	

}
