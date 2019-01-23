package com.dbtest.databasepractice.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dbtest.databasepractice.common.DBOperations;
import com.dbtest.databasepractice.dao.EmployeeDao;
import com.dbtest.databasepractice.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	DBOperations dbOperations;
	Employee employee;

	public boolean insertEmployee(Employee employee) {
		dbOperations = new DBOperations();
		return dbOperations.insert(employee); 
	}

	public List<Employee> viewAllEmplyee() {
		// TODO Auto-generated method stub
		dbOperations = new DBOperations();
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
		dbOperations = new DBOperations();
		return dbOperations.update(employee);
	}

	public boolean deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		dbOperations = new DBOperations();
		return dbOperations.delete(employee.getId());
	}

	@Override
	public boolean getSpecificEmployee(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> getMaxSalary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getSecondMaxSalary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getMinSalary() {
		// TODO Auto-generated method stub
		return null;
	}

}
