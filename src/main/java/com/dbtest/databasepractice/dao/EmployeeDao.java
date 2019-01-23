package com.dbtest.databasepractice.dao;

import java.util.List;

import com.dbtest.databasepractice.model.Employee;

public interface EmployeeDao {
	
	boolean insertEmployee(Employee employee);
	List<Employee> viewAllEmplyee();
	boolean updateEmployee(Employee employee);
	boolean deleteEmployee(int id);
	List<Employee> getSpecificEmployee(int id);
	List<Employee> getMaxSalary();
	List<Employee> getSecondMaxSalary();
	List<Employee> getMinSalary();

}
