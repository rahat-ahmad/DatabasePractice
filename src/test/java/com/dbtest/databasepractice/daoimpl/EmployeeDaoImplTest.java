package com.dbtest.databasepractice.daoimpl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.dbtest.databasepractice.dao.EmployeeDao;
import com.dbtest.databasepractice.model.Employee;

public class EmployeeDaoImplTest {
	Employee employee;
	EmployeeDao employeeDao = new EmployeeDaoImpl(); 
	@Test
	public void testInsertEmployee() {
		assertTrue(employeeDao.insertEmployee(new Employee("Rahat", "Ahmad", "44 Chankherpuller, Dhaka", 45000)));
	}

	@Test
	public void testViewAllEmplyee() {
		List<Employee> employeeList = new ArrayList<Employee>();
		employee = new Employee("Rahat", "Ahmad", "44 Chankherpuller, Dhaka", 45000);
		employeeList = employeeDao.viewAllEmplyee();
		assertEquals(employee.getFirstName(), employeeList.get(1).getFirstName());
		assertEquals(employee.getLastName(), employeeList.get(1).getLastName());
		assertEquals(employee.getAddress(), employeeList.get(1).getAddress());
		assertEquals(employee.getSalary(), employeeList.get(1).getSalary());
	}

	@Test
	public void testUpdateEmployee() {
		employee = new Employee("Rahat", "Ahmad", "44 Chankherpullen, Dhaka", 45000);
		employee.setId(5);
		assertTrue(employeeDao.updateEmployee(employee));
	}

	@Test
	public void testGetSpecificEmployee() {
		employee = new Employee("Rahat", "Ahmad", "44 Chankherpuller, Dhaka", 45000);
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList = employeeDao.getSpecificEmployee(5);
		assertEquals(employee.getFirstName(), employeeList.get(0).getFirstName());
		assertEquals(employee.getLastName(), employeeList.get(0).getLastName());
		assertEquals(employee.getAddress(), employeeList.get(0).getAddress());
		assertEquals(employee.getSalary(), employeeList.get(0).getSalary());
		
	}

	@Test
	public void testGetMaxSalary() {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList = employeeDao.getMaxSalary();
		assertEquals(45000, employeeList.get(0).getSalary());
	}

	@Test
	public void testGetSecondMaxSalary() {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList = employeeDao.getSecondMaxSalary();
		assertEquals(30000, employeeList.get(0).getSalary());
	}

	@Test
	public void testGetMinSalary() {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList = employeeDao.getMinSalary();
		assertEquals(30000, employeeList.get(0).getSalary());
	}

	@Test
	public void testDeleteEmployee() {
		assertTrue(employeeDao.deleteEmployee(5));
	}

}
