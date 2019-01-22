package com.dbtest.databasepractice.dao;

import java.util.List;

import com.dbtest.databasepractice.model.Employee;

public interface EmployeeOperations {
	
	boolean insertEmployee(Employee employee);
	List<Employee> viewAllEmplyee();
	boolean updateEmployee(Employee employee);
	boolean deleteEmployee(Employee employee);

}
