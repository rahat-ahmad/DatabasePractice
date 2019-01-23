package com.dbtest.databasepractice.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dbtest.databasepractice.common.DBOperations;
import com.dbtest.databasepractice.dao.EmployeeDao;
import com.dbtest.databasepractice.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	DBOperations dbOperations = new DBOperations();
	Employee employee;

	public boolean insertEmployee(Employee employee) {
		return dbOperations.insert(employee);
	}

	public List<Employee> viewAllEmplyee() {
		// TODO Auto-generated method stub
		ResultSet resultSet = dbOperations.view();
		if (resultSet == null) {
			return null;
		}

		List<Employee> employeeList = new ArrayList<Employee>();

		try {
			while (resultSet.next()) {
				employee = new Employee(resultSet.getString("efirstname"), resultSet.getString("elastname"),
						resultSet.getString("eaddress"), resultSet.getInt("esal"));
				employee.setId(resultSet.getInt("eid"));
				employeeList.add(employee);
				// TODO Auto-generated catch block
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return employeeList;
	}

	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return dbOperations.update(employee);
	}

	@Override
	public List<Employee> getSpecificEmployee(int id) {
		// TODO Auto-generated method stub
		ResultSet resultSet = dbOperations.getSpecificData(id);
		if (resultSet == null) {
			return null;
		}

		List<Employee> employeeList = new ArrayList<Employee>();

		try {
			while (resultSet.next()) {
				employee = new Employee(resultSet.getString("efirstname"), resultSet.getString("elastname"), resultSet.getString("eaddress"), resultSet.getInt("esal"));
				employee.setId(resultSet.getInt("eid"));
				employeeList.add(employee);
				// TODO Auto-generated catch block
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return employeeList; 
	}

	@Override
	public List<Employee> getMaxSalary() {
		// TODO Auto-generated method stub
		ResultSet resultSet = dbOperations.findMaxSalary();

		if (resultSet == null) {
			return null;
		}

		List<Employee> employeeList = new ArrayList<Employee>();

		try {
			while (resultSet.next()) {
				employee = new Employee(resultSet.getString("efirstname"), resultSet.getString("elastname"), resultSet.getString("eaddress"), resultSet.getInt("esal"));
				employee.setId(resultSet.getInt("eid"));
				employeeList.add(employee);
				// TODO Auto-generated catch block
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return employeeList;
	}

	@Override
	public List<Employee> getSecondMaxSalary() {
		// TODO Auto-generated method stub
		ResultSet resultSet = dbOperations.findSecondMaxSalary();

		if (resultSet == null) {
			return null;
		}

		List<Employee> employeeList = new ArrayList<Employee>();

		try {
			while (resultSet.next()) {
				employee = new Employee(resultSet.getString("efirstname"), resultSet.getString("elastname"), resultSet.getString("eaddress"), resultSet.getInt("esal"));
				employee.setId(resultSet.getInt("eid"));
				employeeList.add(employee);
				// TODO Auto-generated catch block
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return employeeList;
	}

	@Override
	public List<Employee> getMinSalary() {
		// TODO Auto-generated method stub
		ResultSet resultSet = dbOperations.findMinSalary();

		if (resultSet == null) {
			return null;
		}

		List<Employee> employeeList = new ArrayList<Employee>();

		try {
			while (resultSet.next()) {
				employee = new Employee(resultSet.getString("efirstname"), resultSet.getString("elastname"), resultSet.getString("eaddress"), resultSet.getInt("esal"));
				employee.setId(resultSet.getInt("eid"));
				employeeList.add(employee);
				// TODO Auto-generated catch block
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return employeeList;
	}

	@Override
	public boolean deleteEmployee(int id) {

		dbOperations = new DBOperations();
		return dbOperations.delete(id);
	}

}
